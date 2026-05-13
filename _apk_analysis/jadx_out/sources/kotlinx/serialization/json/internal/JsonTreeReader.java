package kotlinx.serialization.json.internal;

import bn.r;
import com.safedk.android.utils.i;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;
import tn.p;
import xo.f;
import xo.v;
import yo.a;
import yo.b;
import yo.j0;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final a f73476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f73477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f73478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73479d;

    public JsonTreeReader(@NotNull f fVar, @NotNull a aVar) {
        p.k(fVar, i.f53156c);
        p.k(aVar, "lexer");
        this.f73476a = aVar;
        this.f73477b = fVar.q();
        this.f73478c = fVar.d();
    }

    @NotNull
    public final JsonElement e() {
        byte bG = this.f73476a.G();
        if (bG == 1) {
            return j(true);
        }
        if (bG == 0) {
            return j(false);
        }
        if (bG == 6) {
            int i10 = this.f73479d + 1;
            this.f73479d = i10;
            this.f73479d--;
            return i10 == 200 ? g() : i();
        }
        if (bG == 8) {
            return f();
        }
        a.z(this.f73476a, "Cannot read Json element because of unexpected " + b.c(bG), 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final JsonElement f() {
        byte bK = this.f73476a.k();
        if (this.f73476a.G() == 4) {
            a.z(this.f73476a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        ArrayList arrayList = new ArrayList();
        while (this.f73476a.f()) {
            arrayList.add(e());
            bK = this.f73476a.k();
            if (bK != 4) {
                a aVar = this.f73476a;
                boolean z10 = bK == 9;
                int i10 = aVar.f97896a;
                if (!z10) {
                    a.z(aVar, "Expected end of the array or comma", i10, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bK == 8) {
            this.f73476a.l((byte) 9);
        } else if (bK == 4) {
            if (!this.f73478c) {
                j0.g(this.f73476a, "array");
                throw new KotlinNothingValueException();
            }
            this.f73476a.l((byte) 9);
        }
        return new JsonArray(arrayList);
    }

    public final JsonElement g() {
        return (JsonElement) kotlin.a.b(new bn.a(new JsonTreeReader$readDeepRecursive$1(this, null)), r.f5635a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(bn.b<bn.r, kotlinx.serialization.json.JsonElement> r21, hn.c<? super kotlinx.serialization.json.JsonElement> r22) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.JsonTreeReader.h(bn.b, hn.c):java.lang.Object");
    }

    public final JsonElement i() {
        byte bL = this.f73476a.l((byte) 6);
        if (this.f73476a.G() == 4) {
            a.z(this.f73476a, "Unexpected leading comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (true) {
            if (!this.f73476a.f()) {
                break;
            }
            String strS = this.f73477b ? this.f73476a.s() : this.f73476a.q();
            this.f73476a.l((byte) 5);
            linkedHashMap.put(strS, e());
            bL = this.f73476a.k();
            if (bL != 4) {
                if (bL != 7) {
                    a.z(this.f73476a, "Expected end of the object or comma", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (bL == 6) {
            this.f73476a.l((byte) 7);
        } else if (bL == 4) {
            if (!this.f73478c) {
                j0.h(this.f73476a, null, 1, null);
                throw new KotlinNothingValueException();
            }
            this.f73476a.l((byte) 7);
        }
        return new JsonObject(linkedHashMap);
    }

    public final JsonPrimitive j(boolean z10) {
        String strS = (this.f73477b || !z10) ? this.f73476a.s() : this.f73476a.q();
        return (z10 || !p.f(strS, "null")) ? new v(strS, z10, null, 4, null) : JsonNull.INSTANCE;
    }
}
