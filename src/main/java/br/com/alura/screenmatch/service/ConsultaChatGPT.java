package br.com.alura.screenmatch.service;

import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;


public class ConsultaChatGPT {

    /* To fix
     -> 429 - You exceeded your current quota, please check your plan and billing details
     */

//    public static String obterTraducao(String texto) {
//        OpenAiService service = new OpenAiService("api-key");
//
//
//        CompletionRequest requisicao = CompletionRequest.builder()
//                .model("gpt-3.5-turbo-instruct")
//                .prompt("traduza para o português o texto: " + texto)
//                .maxTokens(1000)
//                .temperature(0.7)
//                .build();
//
//
//        var resposta = service.createCompletion(requisicao);
//        return resposta.getChoices().get(0).getText();
//    }
}