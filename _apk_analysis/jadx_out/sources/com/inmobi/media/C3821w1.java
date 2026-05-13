package com.inmobi.media;

import android.app.ApplicationExitInfo;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* JADX INFO: renamed from: com.inmobi.media.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C3821w1 extends SuspendLambda implements sn.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3871y1 f28402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ApplicationExitInfo f28403b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3821w1(C3871y1 c3871y1, ApplicationExitInfo applicationExitInfo, hn.c cVar) {
        super(1, cVar);
        this.f28402a = c3871y1;
        this.f28403b = applicationExitInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final hn.c create(hn.c cVar) {
        return new C3821w1(this.f28402a, this.f28403b, cVar);
    }

    @Override // sn.l
    public final Object invoke(Object obj) {
        return new C3821w1(this.f28402a, this.f28403b, (hn.c) obj).invokeSuspend(bn.r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        C3775u5 c3775u5;
        String string;
        Source source;
        in.a.g();
        kotlin.c.b(obj);
        C3775u5 c3775u52 = this.f28402a.f28165a;
        int reason = this.f28403b.getReason();
        String description = this.f28403b.getDescription();
        InputStream traceInputStream = this.f28403b.getTraceInputStream();
        BufferedSource bufferedSourceBuffer = (traceInputStream == null || (source = Okio.source(traceInputStream)) == null) ? null : Okio.buffer(source);
        int i10 = this.f28402a.f28560d;
        tn.p.k("\"main\"", "startMarker");
        tn.p.k("ZygoteInit.java", "endMarker");
        try {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            if (bufferedSourceBuffer != null) {
                int i11 = i10;
                boolean z10 = false;
                while (true) {
                    try {
                        String utf8Line = bufferedSourceBuffer.readUtf8Line();
                        if (utf8Line == null) {
                            break;
                        }
                        if (i10 > 0 && !z10) {
                            sb3.append(utf8Line);
                            sb3.append("\n");
                            i10--;
                        }
                        int i12 = i10;
                        c3775u5 = c3775u52;
                        boolean z11 = z10;
                        try {
                            if (bo.a0.W(utf8Line, "\"main\"", false, 2, null)) {
                                bo.w.m(sb3);
                                z10 = true;
                            } else {
                                z10 = z11;
                            }
                            if (z10) {
                                i11--;
                                sb2.append(utf8Line);
                                sb2.append("\n");
                            }
                            if (bo.d0.c0(utf8Line, "ZygoteInit.java", false, 2, null) || i11 <= 0) {
                                break;
                            }
                            i10 = i12;
                            c3775u52 = c3775u5;
                        } catch (IOException e10) {
                            e = e10;
                            Log.e("CommonExt", "Error reading from input stream", e);
                        }
                    } catch (IOException e11) {
                        e = e11;
                        c3775u5 = c3775u52;
                    }
                }
            } else {
                c3775u5 = c3775u52;
            }
            if (sb2.length() == 0) {
                string = sb3.toString();
                tn.p.j(string, "toString(...)");
                if (bufferedSourceBuffer != null) {
                    try {
                        bufferedSourceBuffer.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                string = sb2.toString();
                tn.p.j(string, "toString(...)");
                if (bufferedSourceBuffer != null) {
                    tn.p.k(bufferedSourceBuffer, "<this>");
                    bufferedSourceBuffer.close();
                }
            }
            c3775u5.a(new C3896z1(description, reason, string));
            return bn.r.f5635a;
        } finally {
            if (bufferedSourceBuffer != null) {
                tn.p.k(bufferedSourceBuffer, "<this>");
                try {
                    bufferedSourceBuffer.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
