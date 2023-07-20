/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gestaoqualidadeprojetos.service;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author Note102
 */
public class DashboardProcessContextService {

    private Map<String, Object> context;
    private Object processResult;

    public DashboardProcessContextService() {
        context = new LinkedHashMap<String, Object>();
    }

    public Object get(String key) throws RuntimeException, Exception {
        if (!key.contains(".")) {
            return context.get(key);
        }
        String[] steps = key.split("\\.");
        Object currentMap = context;
        for (String step : steps) {
            if (currentMap instanceof Map) {
                currentMap = ((Map<String, Object>) currentMap).get(step);
            } else {
                throw new RuntimeException(String.format("Could not navigate through %s step", step));
            }
        }
        return currentMap;
    }

    public Object put(String key, Object value) {
        return context.put(key, value);
    }

    public Object remove(String key) {
        return context.remove(key);
    }

    public void reset() {
        context = new LinkedHashMap<String, Object>();
        processResult = null;
    }

    public void encapsulate(String key) {
        Map<String, Object> newContext = new LinkedHashMap<String, Object>();
        newContext.put(key, context);
        context = newContext;
    }

    public void addProcessResult(Object result) {
        this.processResult = result;
    }

    public Object getProcessResult() {
        return processResult;
    }
}
