package io.ktor.http.cio;

import bo.d0;
import cn.w;
import cn.w0;
import il.c;
import il.d;
import il.j;
import il.k;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.ktor.utils.io.b;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import org.jetbrains.annotations.NotNull;
import tn.p;

/* JADX INFO: compiled from: HttpParser.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class HttpParserKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Set<Character> f71183a = w0.j('/', '?', '#', '@');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f71184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final c<String> f71185c;

    static {
        b.a aVar = io.ktor.utils.io.b.f71271b;
        f71184b = io.ktor.utils.io.b.j(aVar.b(), aVar.c());
        f71185c = c.f64295b.c(w.p("HTTP/1.0", "HTTP/1.1"));
    }

    public static final Void a(CharSequence charSequence, char c10) {
        throw new ParserException("Character with code " + (c10 & 255) + " is not allowed in header names, \n" + ((Object) charSequence));
    }

    public static final boolean b(char c10) {
        return p.m(c10, 32) <= 0 || d0.b0("\"(),/:;<=>?@[\\]{}", c10, false, 2, null);
    }

    public static final Void c(CharSequence charSequence, j jVar) {
        throw new ParserException("No colon in HTTP header in " + charSequence.subSequence(jVar.b(), jVar.a()).toString() + " in builder: \n" + ((Object) charSequence));
    }

    public static final int d(@NotNull d dVar, @NotNull j jVar) {
        p.k(dVar, "text");
        p.k(jVar, "range");
        int iA = jVar.a();
        for (int iB = jVar.b(); iB < iA; iB++) {
            char cCharAt = dVar.charAt(iB);
            if (cCharAt == ':' && iB != jVar.b()) {
                jVar.d(iB + 1);
                return iB;
            }
            if (b(cCharAt)) {
                e(dVar, iB, jVar.b(), cCharAt);
                throw new KotlinNothingValueException();
            }
        }
        c(dVar, jVar);
        throw new KotlinNothingValueException();
    }

    public static final Void e(d dVar, int i10, int i11, char c10) {
        if (c10 == ':') {
            throw new ParserException("Empty header names are not allowed as per RFC7230.");
        }
        if (i10 == i11) {
            throw new ParserException("Multiline headers via line folding is not supported since it is deprecated as per RFC7230.");
        }
        a(dVar, c10);
        throw new KotlinNothingValueException();
    }

    public static final void f(@NotNull d dVar, @NotNull j jVar) {
        p.k(dVar, "text");
        p.k(jVar, "range");
        int iB = jVar.b();
        int iA = jVar.a();
        int iA2 = k.a(dVar, iB, iA);
        if (iA2 >= iA) {
            jVar.d(iA);
            return;
        }
        int i10 = iA2;
        int i11 = i10;
        while (i10 < iA) {
            char cCharAt = dVar.charAt(i10);
            if (cCharAt != '\t') {
                if (cCharAt == '\n' || cCharAt == '\r') {
                    a(dVar, cCharAt);
                    throw new KotlinNothingValueException();
                }
                if (cCharAt != ' ') {
                    i11 = i10;
                }
            }
            i10++;
        }
        jVar.d(iA2);
        jVar.c(i11 + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:23:0x006e, B:25:0x0076, B:27:0x007b, B:30:0x008f, B:31:0x00b0, B:32:0x00bb, B:33:0x00bc, B:35:0x00c8), top: B:45:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:23:0x006e, B:25:0x0076, B:27:0x007b, B:30:0x008f, B:31:0x00b0, B:32:0x00bb, B:33:0x00bc, B:35:0x00c8), top: B:45:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0069 -> B:45:0x006e). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@org.jetbrains.annotations.NotNull io.ktor.utils.io.a r11, @org.jetbrains.annotations.NotNull il.d r12, @org.jetbrains.annotations.NotNull il.j r13, @org.jetbrains.annotations.NotNull hn.c<? super hl.a> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HttpParserKt.g(io.ktor.utils.io.a, il.d, il.j, hn.c):java.lang.Object");
    }

    public static /* synthetic */ Object h(io.ktor.utils.io.a aVar, d dVar, j jVar, hn.c cVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            jVar = new j(0, 0);
        }
        return g(aVar, dVar, jVar, cVar);
    }

    public static final void i(CharSequence charSequence) {
        boolean z10 = false;
        if (d0.i0(charSequence, StringUtils.PROCESS_POSTFIX_DELIMITER, false, 2, null)) {
            throw new ParserException("Host header with ':' should contains port: " + ((Object) charSequence));
        }
        int i10 = 0;
        while (true) {
            if (i10 >= charSequence.length()) {
                break;
            }
            if (f71183a.contains(Character.valueOf(charSequence.charAt(i10)))) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            throw new ParserException("Host cannot contain any of the following symbols: " + f71183a);
        }
    }
}
