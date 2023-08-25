package com.example.hub

class JSONs {

    companion object {

        val API_CONSUMER_RULE_JSON = """
        {
            "rule": "API_CONSUMER",
            "order": 3,
            "url": "https://alguma.api.com.br/algum/path/{id}",
            "body" : "{ \"name\" : \"\teste\"}",
            "parameters": {
                "path": [
                    {
                        "markup": "id",
                        "value": "resquest.body.id"
                    }
                ],
                "query": [
                    {
                        "markup": "var_name",
                        "value": "request.header.customer"
                    }
                ],
                "body": [
                    {
                        "markup": "var",
                        "value": "request.header.var"
                    }
                ],
                "headers": [
                    {
                        "variable": "Authorization",
                        "value_interpolation": "Bearer request.header.token"
                    },
                    {
                        "variable": "Content-type",
                        "value": "application/json"
                    },
                    {
                        "variable": "x-idempotency-key",
                        "value_from_context": "request.header.idempotencyKey"
                    }
                ]
            },
            "contextOutput": "identificador_no_contexto_onde_o_payload_de_resposta_vai_ficar"
        }
        """.trimIndent()

        val VALUE_VALIDATION_RULE_JSON = """
        {
            "rule": "VALUE_VALIDATION",
            "order": 1,
            "operation": {
                "field": ".request.body.valor_transacao",
                "validation": {
                    "eq": ".identificador_no_contexto_onde_o_payload_de_resposta_vai_ficar.value",
                    "gte": ".identificador_no_contexto_onde_o_payload_de_resposta_vai_ficar.value",
                    "gt": ".identificador_no_contexto_onde_o_payload_de_resposta_vai_ficar.value",
                    "lt": ".identificador_no_contexto_onde_o_payload_de_resposta_vai_ficar.value",
                    "lte": ".identificador_no_contexto_onde_o_payload_de_resposta_vai_ficar.value"
                }
            }
        }
        """.trimIndent()

        val DATA_BASE_RULE_JSON = """
        {
            "rule": "DATA_BASE",
            "order": 2,
            "database_connection_id": 1234,
            "operation": "SELECT",
            "field": "name,address",
            "table": "Seller",
            "condition": "ID = request.seller_id",
            "query": "SELECT <CAMPOS> FROM <TABELA> WHERE <CONDITION>",
            "result_output": [
                {
                    "result.seller_name": "name",
                    "result.seller_address": "address"
                }
            ]
        }
        """.trimIndent()

       val COMPOST_JSON = """
       {
            id: rulesetId,
            "rule_set": 
              [ 
                $API_CONSUMER_RULE_JSON ,
                $VALUE_VALIDATION_RULE_JSON ,
                $DATA_BASE_RULE_JSON
              ]
       }         
    """.trimIndent()
    }

}