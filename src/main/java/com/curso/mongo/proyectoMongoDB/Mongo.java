
package com.curso.mongo.proyectoMongoDB;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.*;
import org.bson.Document;



public class Mongo {
    public static void main(String[] args) {
        MongoClient clienteMongo = new MongoClient("localhost",27017);
        
       // DB db = clienteMongo.getDB("jpa");
       MongoCredential credencial;
       credencial = MongoCredential.createCredential("root", "jpa", "root".toCharArray());
       MongoDatabase db = clienteMongo.getDatabase("jpa");
       
       MongoCollection<Document> jugador = db.getCollection("jugador");
       MongoCollection<Document> campeon= db.getCollection("campeon");
       MongoCollection<Document> batalla = db.getCollection("batalla");
       
       Document document = new Document("mongo","MongoDB") 
               .append("idFramework",1)
               .append("nombre","jpa");
       
       jugador.insertOne(document);
       
        System.out.println("Documento INSERTADO correctamente");
       
       
    }
}

