package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;
import kotlin.Result;
import kotlin.c;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: NonBehavioralFlag.kt */
/* JADX INFO: loaded from: classes5.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;


    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: NonBehavioralFlag.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final NonBehavioralFlag fromString(@NotNull String str) {
            Object objM7534constructorimpl;
            p.k(str, "value");
            try {
                Result.a aVar = Result.Companion;
                String upperCase = str.toUpperCase(Locale.ROOT);
                p.j(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                objM7534constructorimpl = Result.m7534constructorimpl(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM7534constructorimpl = Result.m7534constructorimpl(c.a(th2));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (Result.m7539isFailureimpl(objM7534constructorimpl)) {
                objM7534constructorimpl = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) objM7534constructorimpl;
        }
    }
}
