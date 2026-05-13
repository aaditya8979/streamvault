package com.unity3d.ads.core.data.model;

import org.jetbrains.annotations.NotNull;
import tn.i;

/* JADX INFO: compiled from: ScarEvent.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class ScarEvent {

    /* JADX INFO: compiled from: ScarEvent.kt */
    public static final class Show extends ScarEvent {

        @NotNull
        public static final Show INSTANCE = new Show();

        private Show() {
            super(null);
        }
    }

    private ScarEvent() {
    }

    public /* synthetic */ ScarEvent(i iVar) {
        this();
    }
}
