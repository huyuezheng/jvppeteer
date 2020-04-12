package com.ruiyun.jvppeteer.protocol.context;

/**
 * Description of an isolated world.
 */
public class ExecutionContextDescription {

    /**
     * Unique id of the execution context. It can be used to specify in which execution context
     script evaluation should be performed.
     */
    private int id;
    /**
     * Execution context origin.
     */
    private String origin;
    /**
     * Human readable name describing given context.
     */
    private String name;
    /**
     * Embedder-specific auxiliary data.
     */
    private Object auxData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getAuxData() {
        return auxData;
    }

    public void setAuxData(Object auxData) {
        this.auxData = auxData;
    }
}