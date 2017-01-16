package chemicalexpansion.common.item;

import chemicalexpansion.common.Element;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

import java.io.*;
import java.util.*;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: 
 Created: 11/12/2016, 18:15:39
 Project: Chemical_Expansion
 Description: 
 ********************************/

public class ItemElement {

    private static Map<Integer, Element> elementMap;
    //public static final String ELEMENTS_FILE = "assets/chemicalexpansion/data/elements.json";

    public static void init() {
        elementMap = new HashMap<Integer, Element>();
        InputStream is = getJsonFile();
        readFromStream(is);
        try {
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Cannot close stream!");
        }
    }

    public static Element getElement(int atomNumber) {
        return elementMap.get(atomNumber);
    }

    public static Collection<Element> getElements() {
        return elementMap.values();
    }

    private static void readFromStream(InputStream stream) {
        JsonReader reader = new JsonReader(new InputStreamReader(stream));
        JsonParser parser = new JsonParser();

        Set<Map.Entry<String, JsonElement>> elementsSet = parser.parse(reader).getAsJsonObject().entrySet();
        int c = 0;
        for (Map.Entry<String, JsonElement> elementEntry : elementsSet) {
            if (!elementEntry.getValue().isJsonObject()) {
                continue;
            }
            JsonObject elementObject = elementEntry.getValue().getAsJsonObject();
            elementMap.put(Integer.parseInt(elementEntry.getKey()),new Element(
                    Integer.parseInt(elementEntry.getKey()),
                    elementObject.get("symbol").getAsString(),
                    elementObject.get("name").getAsString(),
                    Integer.parseInt(elementObject.get("group").getAsString()),
                    elementObject.get("block").getAsString(),
                    Integer.parseInt(elementObject.get("period").getAsString()),
                    elementObject.get("desc").getAsString(),
                    elementObject.get("phase").getAsString(),
                    elementObject.get("colour").getAsString(),
                    Double.parseDouble(elementObject.get("melting").getAsString()),
                    Double.parseDouble(elementObject.get("boiling").getAsString()),
                    elementObject.get("discoverer").getAsString()
            ));
            c++;
            System.out.println("Successfully registered " + elementObject.get("name").getAsString());
        }
        System.out.println("Total of " + c + " elements registered from elements.json.");
    }

    private static InputStream getJsonFile() {
        ResourceLocation res = new ResourceLocation("chemicalexpansion:data/elements.json");
        //File file = new File(filename);
        //System.out.println(Arrays.toString(file.listFiles()));
        InputStream stream = null;
        try {
            stream = Minecraft.getMinecraft().getResourceManager().getResource(res).getInputStream();
        } catch (IOException e) {
            System.out.println("OH NOES.");
            e.printStackTrace();
        }
        return stream;
    }
}
