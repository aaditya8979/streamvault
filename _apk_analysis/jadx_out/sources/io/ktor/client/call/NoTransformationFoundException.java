package io.ktor.client.call;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bo.t;
import dl.c;
import gl.m;
import gl.s;
import io.ktor.client.statement.HttpResponseKt;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpClientCall.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {

    @NotNull
    private final String message;

    public NoTransformationFoundException(@NotNull c cVar, @NotNull KClass<?> kClass, @NotNull KClass<?> kClass2) {
        p.k(cVar, "response");
        p.k(kClass, TypedValues.TransitionType.S_FROM);
        p.k(kClass2, TypedValues.TransitionType.S_TO);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        Expected response body of the type '");
        sb2.append(kClass2);
        sb2.append("' but was '");
        sb2.append(kClass);
        sb2.append("'\n        In response from `");
        sb2.append(HttpResponseKt.d(cVar).getUrl());
        sb2.append("`\n        Response status `");
        sb2.append(cVar.d());
        sb2.append("`\n        Response header `ContentType: ");
        m headers = cVar.getHeaders();
        s sVar = s.f62569a;
        sb2.append(headers.get(sVar.i()));
        sb2.append("` \n        Request header `Accept: ");
        sb2.append(HttpResponseKt.d(cVar).getHeaders().get(sVar.c()));
        sb2.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.message = t.j(sb2.toString());
    }

    @Override // java.lang.Throwable
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
