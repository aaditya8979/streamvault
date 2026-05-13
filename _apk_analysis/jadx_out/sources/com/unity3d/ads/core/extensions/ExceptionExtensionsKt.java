package com.unity3d.ads.core.extensions;

import bo.d0;
import com.unity3d.services.SDKErrorHandler;
import java.io.PrintWriter;
import java.io.StringWriter;
import kotlin.sequences.SequencesKt___SequencesKt;
import on.b;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: ExceptionExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class ExceptionExtensionsKt {
    @NotNull
    public static final String getShortenedStackTrace(@NotNull Throwable th2, int i10) {
        p.k(th2, "<this>");
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                PrintWriter printWriter = new PrintWriter(stringWriter);
                try {
                    th2.printStackTrace(printWriter);
                    String string = stringWriter.toString();
                    p.j(string, "stringWriter.toString()");
                    String strI = SequencesKt___SequencesKt.I(SequencesKt___SequencesKt.R(d0.A0(d0.s1(string).toString()), i10), "\n", null, null, 0, null, null, 62, null);
                    b.a(printWriter, null);
                    b.a(stringWriter, null);
                    return strI;
                } finally {
                }
            } finally {
            }
        } catch (Throwable unused) {
            return "";
        }
    }

    public static /* synthetic */ String getShortenedStackTrace$default(Throwable th2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 15;
        }
        return getShortenedStackTrace(th2, i10);
    }

    @NotNull
    public static final String retrieveUnityCrashValue(@NotNull Throwable th2) {
        StackTraceElement stackTraceElement;
        boolean zC0;
        String className;
        p.k(th2, "<this>");
        StackTraceElement[] stackTrace = th2.getStackTrace();
        p.j(stackTrace, "this.stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            stackTraceElement = null;
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement2 = stackTrace[i10];
            if (stackTraceElement2 == null || (className = stackTraceElement2.getClassName()) == null) {
                zC0 = false;
            } else {
                p.j(className, "className");
                zC0 = d0.c0(className, SDKErrorHandler.UNITY_PACKAGE, false, 2, null);
            }
            if (zC0) {
                stackTraceElement = stackTraceElement2;
                break;
            }
            i10++;
        }
        if (stackTraceElement == null) {
            return "unknown";
        }
        String fileName = stackTraceElement.getFileName();
        if (fileName == null) {
            fileName = "unknown";
        } else {
            p.j(fileName, "it.fileName ?: SDKErrorHandler.UNKNOWN_FILE");
        }
        String str = fileName + '_' + stackTraceElement.getLineNumber();
        return str != null ? str : "unknown";
    }
}
