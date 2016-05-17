package com.mycompany;

import org.jooby.test.AppRule;
import org.jooby.test.Client;
import org.junit.ClassRule;
import org.junit.Rule;

/**
 * @author Bruno Rodrigues
 */
public class BaseTest {

  /**
   * Um app/server para todo o teste desta classe .. Se você quiser, start/stop para um novo servidor de teste ,
   * Remover o modificador estático e substituir o {@link ClassRule} anotação com {@link Rule}.
   */
  @ClassRule
  public static AppRule app = new AppRule(new App());

  /**
   * Um Cliente por teste. Ele cria um novo HTTP Cliente pora cada um dos método de teste que você tem.
   */
  @Rule
  public Client server = new Client("http://localhost:8080");

}
