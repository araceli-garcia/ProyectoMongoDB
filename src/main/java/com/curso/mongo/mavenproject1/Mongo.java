
package com.curso.mongo.mavenproject1;

import com.mongodb.BasicDBObject;
import com.mongodb.Block;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.util.Map;


public class Mongo {
    static MongoCollection<Document> collection;
    static MongoDatabase db ;
    static MongoCredential credencial;
    static MongoClient clienteMongo;
    static Document document;
    public static void main(String[] args) {
         clienteMongo= new MongoClient("localhost",27017);
        
        
        credencial = MongoCredential.createCredential("root","JPA","root".toCharArray());
        //DB db= clienteMongo.getDB("JPA");
        db = clienteMongo.getDatabase("RolDeJuegos1");
        
        collection = db.getCollection("campeon");
        
        Crear();
        
        Mostrar();
        
    }
    
    public static  void Crear(){
        document = new Document("idCampeon",1)
                .append("nombre","Juan Perez")
                .append("Edad",20)
                .append("sexo","Hombre")
                .append("tipo", 1)
                .append("precio", 25.00)
                .append("fechaCreacion", "20/10/15")
                .append("fechaActualización", "")
                .append("fechaEliminacion", "");
        collection.insertOne(document);
        System.out.println("Documento Insertado Correctamente");
    }
    
    public void Eliminar(){
        
        
    }
    
    public static void Actualizar(){
        
        
    }
    
    public static void Mostrar(){
        /*for (Map.Entry<String, Object> set : document.entrySet()) {
                       
            System.out.format("%s: %s%n", set.getKey(), set.getValue());
        }
        BasicDBObject query = new BasicDBObject("price", 
        new BasicDBObject("$gt", 30000));
        
        collection.find(query).forEach(new Block<Document>() {
    @Override
    public void apply(final Document document) {
        System.out.println(document.toJson());
    }
});

        
        
        
        
        clienteMongo.close(); // cerrar la base de datos
    
*/
        /*
     System.out.println("Print the documents.");

            MongoCursor cursor = collection.find().iterator();
            try {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().getClass());
                }
            } finally {
                cursor.close();
            }*/
            DBObject query = new BasicDBObject("nombre", new BasicDBObject("$regex", "Juan Perez"));
            DBCursor cursor = collection.find();
        
        cursor = collection.find(query);
        
        
    }
    


}
