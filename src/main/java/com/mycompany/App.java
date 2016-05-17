package com.mycompany;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import org.jooby.Jooby;
import org.jooby.Results;
import org.jooby.json.Jackson;

/**
 * @author Bruno Rodrigues;
 * App para inserir e consultar dados de uma agente (AppointmentBook);
 * v 1.0
 */
public class App extends Jooby {

    private ArrayList<Contact> contatos = new ArrayList<>();
    private int lastId = 1;

    {
        use(new Jackson());
        use(TestRoute.class);

        /**Método - Chamada do servidor
         * Tela de "Bem Vindos"
         */
        get("", req -> {
            return "Appointment Book Eng.Soft";
        });

        /**
         * Método - buscar um contato por id;
         * @param id do contato / id usado para consultar os dados;
         * @return Resultado;
         */
        get("/contato/:id", req -> {
            int id = Integer.parseInt(req.param("id").value()) - 1;

            int statusCode = 404;
            String message = "Contato não cadastrado!";

            try {
                Contact contato = this.contatos.get(id);

                ObjectMapper mapper = new ObjectMapper();
                message = mapper.writeValueAsString(contato);
                statusCode = 200;

                return Results.with(message).status(statusCode).type("text/plain");
                
            } catch (IndexOutOfBoundsException e) {
                return Results.with(message).status(statusCode).type("text/plain");
            }
        });

        /**
         * Método - Adicionar novo contato;
         * @return resultado com contato já cadastrado;
         */
        post("/contato", req -> {
            ObjectMapper mapper = new ObjectMapper();

            String jsonInString = req.body().value();
            Contact contato = mapper.readValue(jsonInString, Contact.class);

            int statusCode = 400;
            String message;

            if (contato.getNome().equals("")) {
                message = "O campo nome não pode estar vazio.";
            } else if (contato.getTelefone().equals("")) {
                message = "O campo 'número de telefone' não pode estar vazio.";
            } else {
                statusCode = 200;
                contato.setId(this.lastId);
                this.lastId++;
                this.contacts.add(contato);
                message = mapper.writeValueAsString(contato);
            }return Results.with(message).status(statusCode).type("text/plain");
        });
    }
    public static void main(final String[] args) throws Throwable {
        run(App::new, args);
    }

}
