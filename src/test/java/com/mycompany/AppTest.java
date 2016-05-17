package com.mycompany;

import org.junit.Test;

/**
 * @author Bruno Rodrigues
 */
public class AppTest extends BaseTest {

    static String JSON_TO_INSERT = "{\"nome\": \"Bruno\", \"telefone\": \"82 9 9949-0404\"}";
    static String JSON_EXPECTED
        = "{\"id\":13,\"nome\":\"Bruno\",\"telefone\":\"82 9 9949-0404\"}";

    @Test
    public void selectContact() throws Exception {
        server.post("/contato").body(JSON_TO_INSERT, "application/json");
        server.get("/contato/13").expect(JSON_EXPECTED).expect(200);
    }

    @Test
    public void addcontact() throws Exception {
        server.post("/contato")
            .body(JSON_TO_INSERT, "application/json")
            .expect(JSON_EXPECTED)
            .expect(200);
    }

}
