package com.aikonia.app.ui.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001ae\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a\u0012\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007\u001a:\u0010\u0018\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007\u001a \u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001cH\u0007\u001a\u001e\u0010\"\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007\u001a\u001e\u0010$\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010&H\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"ConversationTestTag", "", "getConversationTestTag", "()Ljava/lang/String;", "AppBar", "", "onClickAction", "Lkotlin/Function0;", "onMuteClick", "isMuted", "", "image", "", "text", "tint", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "FlowerFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "AppBar-b2xZFOE", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZILjava/lang/String;JJLandroidx/compose/ui/text/font/FontFamily;)V", "Capabilities", "modifier", "Landroidx/compose/ui/Modifier;", "ChatScreen", "navigateToBack", "name", "examples", "", "viewModel", "Lcom/aikonia/app/ui/chat/ChatViewModel;", "MessageList", "messages", "Lcom/aikonia/app/data/model/MessageModel;", "StopButton", "onClick", "TextInput", "inputText", "Landroidx/compose/runtime/MutableState;", "app_debug"})
public final class ChatScreenKt {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ConversationTestTag = "ConversationTestTag";
    
    @androidx.compose.runtime.Composable
    public static final void ChatScreen(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigateToBack, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> examples, @org.jetbrains.annotations.NotNull
    com.aikonia.app.ui.chat.ChatViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TextInput(@org.jetbrains.annotations.NotNull
    com.aikonia.app.ui.chat.ChatViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> inputText) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void StopButton(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void Capabilities(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getConversationTestTag() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    public static final void MessageList(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    java.util.List<com.aikonia.app.data.model.MessageModel> messages) {
    }
}