package com.idaobin.restaurant.basic;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class JacksonUtil {

    private static ObjectMapper mapper = new ObjectMapper();

    static {
        mapper.setSerializationInclusion(Include.NON_EMPTY);
    }

    //json转bean
    public static <T> T deserialize(String json,Class<T> cls){
        T t = null;
        try{
            t=mapper.readValue(json, cls);
        }catch (Exception ex){
            return null;
        }
        return t;
    }

    public static Object getFileValue(String json,String filedName) {
        try{
            JsonNode rootNode = mapper.readTree(json);
            return rootNode.get(filedName).toString().replace("\"", "");
        }
        catch (Exception ex){
            return "";
        }
    }


    //bean转json
    public static String beanToJson(Object obj) {
        String json="";
        try {
            json=mapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return json;
    }

    //list转json
    public static String listToJson(List list){
        String json="";
        try {
            json=mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return json;
    }
}
