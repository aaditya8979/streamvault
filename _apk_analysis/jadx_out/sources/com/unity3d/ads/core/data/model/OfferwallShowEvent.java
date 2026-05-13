package com.unity3d.ads.core.data.model;

import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: OfferwallShowEvent.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OfferwallShowEvent {

    /* JADX INFO: compiled from: OfferwallShowEvent.kt */
    public static final class Show extends OfferwallShowEvent {

        @NotNull
        public static final Show INSTANCE = new Show();

        private Show() {
            super(null);
        }
    }

    private OfferwallShowEvent() {
    }

    public /* synthetic */ OfferwallShowEvent(i iVar) {
        this();
    }
}
