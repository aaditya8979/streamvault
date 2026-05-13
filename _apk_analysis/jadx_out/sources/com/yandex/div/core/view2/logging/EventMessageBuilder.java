package com.yandex.div.core.view2.logging;

import bo.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EventMessageBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
public class EventMessageBuilder {

    @NotNull
    private final StringBuilder consolidatedEvents = new StringBuilder();

    public final void appendEventMessage(@NotNull String str, @NotNull String str2) {
        if (this.consolidatedEvents.length() > 0) {
            this.consolidatedEvents.append(", ");
        }
        this.consolidatedEvents.append(str + " (" + str2 + ')');
    }

    @Nullable
    public final String buildEventsLogMessage() {
        StringBuilder sb2 = this.consolidatedEvents;
        if (!(sb2.length() > 0)) {
            return null;
        }
        String string = sb2.toString();
        w.m(sb2);
        return string;
    }
}
