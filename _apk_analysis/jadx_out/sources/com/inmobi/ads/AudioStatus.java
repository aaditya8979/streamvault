package com.inmobi.ads;

import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class AudioStatus {
    private static final /* synthetic */ kn.a $ENTRIES;
    private static final /* synthetic */ AudioStatus[] $VALUES;

    @NotNull
    public static final Companion Companion;
    public static final AudioStatus PLAYING = new AudioStatus("PLAYING", 0);
    public static final AudioStatus PAUSED = new AudioStatus("PAUSED", 1);
    public static final AudioStatus COMPLETED = new AudioStatus("COMPLETED", 2);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public AudioStatus from(int i10) {
            return i10 != 0 ? i10 != 1 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING;
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }

        @NotNull
        public Integer to(@NotNull AudioStatus audioStatus) {
            p.k(audioStatus, "item");
            return Integer.valueOf(audioStatus.ordinal());
        }
    }

    private static final /* synthetic */ AudioStatus[] $values() {
        return new AudioStatus[]{PLAYING, PAUSED, COMPLETED};
    }

    static {
        AudioStatus[] audioStatusArr$values = $values();
        $VALUES = audioStatusArr$values;
        $ENTRIES = kotlin.enums.a.a(audioStatusArr$values);
        Companion = new Companion(null);
    }

    private AudioStatus(String str, int i10) {
    }

    @NotNull
    public static AudioStatus from(int i10) {
        return Companion.from(i10);
    }

    @NotNull
    public static kn.a<AudioStatus> getEntries() {
        return $ENTRIES;
    }

    public static int to(@NotNull AudioStatus audioStatus) {
        return Companion.to(audioStatus).intValue();
    }

    public static AudioStatus valueOf(String str) {
        return (AudioStatus) Enum.valueOf(AudioStatus.class, str);
    }

    public static AudioStatus[] values() {
        return (AudioStatus[]) $VALUES.clone();
    }
}
