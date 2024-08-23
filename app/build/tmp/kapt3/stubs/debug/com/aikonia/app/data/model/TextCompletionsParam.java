package com.aikonia.app.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0002\u0010\u0011J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\bH\u00c6\u0003J\t\u0010)\u001a\u00020\rH\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003J_\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0001J\u0013\u0010,\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010.\u001a\u00020\bH\u0016J\t\u0010/\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0012\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!\u00a8\u00060"}, d2 = {"Lcom/aikonia/app/data/model/TextCompletionsParam;", "", "promptText", "", "temperature", "", "topP", "n", "", "stream", "", "maxTokens", "model", "Lcom/aikonia/app/data/model/GPTModel;", "messagesTurbo", "", "Lcom/aikonia/app/data/model/MessageTurbo;", "(Ljava/lang/String;DDIZILcom/aikonia/app/data/model/GPTModel;Ljava/util/List;)V", "isTurbo", "()Z", "getMaxTokens", "()I", "getMessagesTurbo", "()Ljava/util/List;", "getModel", "()Lcom/aikonia/app/data/model/GPTModel;", "getN", "getPromptText", "()Ljava/lang/String;", "getStream", "setStream", "(Z)V", "getTemperature", "()D", "getTopP", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class TextCompletionsParam {
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "prompt")
    private final java.lang.String promptText = null;
    @com.google.gson.annotations.SerializedName(value = "temperature")
    private final double temperature = 0.0;
    @com.google.gson.annotations.SerializedName(value = "top_p")
    private final double topP = 0.0;
    @com.google.gson.annotations.SerializedName(value = "n")
    private final int n = 0;
    @com.google.gson.annotations.SerializedName(value = "stream")
    private boolean stream;
    @com.google.gson.annotations.SerializedName(value = "maxTokens")
    private final int maxTokens = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "model")
    private final com.aikonia.app.data.model.GPTModel model = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "messages")
    private final java.util.List<com.aikonia.app.data.model.MessageTurbo> messagesTurbo = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.aikonia.app.data.model.TextCompletionsParam copy(@org.jetbrains.annotations.NotNull
    java.lang.String promptText, double temperature, double topP, int n, boolean stream, int maxTokens, @org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.GPTModel model, @org.jetbrains.annotations.NotNull
    java.util.List<com.aikonia.app.data.model.MessageTurbo> messagesTurbo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public TextCompletionsParam() {
        super();
    }
    
    public TextCompletionsParam(@org.jetbrains.annotations.NotNull
    java.lang.String promptText, double temperature, double topP, int n, boolean stream, int maxTokens, @org.jetbrains.annotations.NotNull
    com.aikonia.app.data.model.GPTModel model, @org.jetbrains.annotations.NotNull
    java.util.List<com.aikonia.app.data.model.MessageTurbo> messagesTurbo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPromptText() {
        return null;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double getTemperature() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double getTopP() {
        return 0.0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getN() {
        return 0;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getStream() {
        return false;
    }
    
    public final void setStream(boolean p0) {
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getMaxTokens() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.aikonia.app.data.model.GPTModel component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.aikonia.app.data.model.GPTModel getModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.aikonia.app.data.model.MessageTurbo> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.aikonia.app.data.model.MessageTurbo> getMessagesTurbo() {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    public final boolean isTurbo() {
        return false;
    }
}