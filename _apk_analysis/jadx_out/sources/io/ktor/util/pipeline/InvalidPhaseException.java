package io.ktor.util.pipeline;

import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: PipelinePhase.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class InvalidPhaseException extends Throwable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidPhaseException(@NotNull String str) {
        super(str);
        p.k(str, "message");
    }
}
