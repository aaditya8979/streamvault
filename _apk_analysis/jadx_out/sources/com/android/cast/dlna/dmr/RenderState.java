package com.android.cast.dlna.dmr;

import org.fourthline.cling.support.model.TransportState;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: RenderControl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RenderState {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ RenderState[] f7018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kn.a f7019c;
    public static final RenderState IDLE = new RenderState("IDLE", 0);
    public static final RenderState PREPARING = new RenderState("PREPARING", 1);
    public static final RenderState PLAYING = new RenderState("PLAYING", 2);
    public static final RenderState PAUSED = new RenderState("PAUSED", 3);
    public static final RenderState STOPPED = new RenderState("STOPPED", 4);
    public static final RenderState ERROR = new RenderState("ERROR", 5);

    /* JADX INFO: compiled from: RenderControl.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RenderState.values().length];
            try {
                iArr[RenderState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RenderState.PREPARING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RenderState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RenderState.STOPPED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RenderState.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        RenderState[] renderStateArrD = d();
        f7018b = renderStateArrD;
        f7019c = kotlin.enums.a.a(renderStateArrD);
    }

    public RenderState(String str, int i10) {
    }

    public static final /* synthetic */ RenderState[] d() {
        return new RenderState[]{IDLE, PREPARING, PLAYING, PAUSED, STOPPED, ERROR};
    }

    @NotNull
    public static kn.a getEntries() {
        return f7019c;
    }

    public static RenderState valueOf(String str) {
        return (RenderState) Enum.valueOf(RenderState.class, str);
    }

    public static RenderState[] values() {
        return (RenderState[]) f7018b.clone();
    }

    @NotNull
    public final TransportState toTransportState() {
        int i10 = a.$EnumSwitchMapping$0[ordinal()];
        return (i10 == 1 || i10 == 2) ? TransportState.PLAYING : i10 != 3 ? (i10 == 4 || i10 == 5) ? TransportState.STOPPED : TransportState.NO_MEDIA_PRESENT : TransportState.PAUSED_PLAYBACK;
    }
}
