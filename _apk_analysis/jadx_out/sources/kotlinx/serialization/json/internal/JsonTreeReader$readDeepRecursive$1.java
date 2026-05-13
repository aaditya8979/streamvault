package kotlinx.serialization.json.internal;

import bn.b;
import bn.r;
import hn.c;
import in.a;
import jn.d;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.serialization.json.JsonElement;
import sn.q;

/* JADX INFO: compiled from: JsonTreeReader.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
public final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements q<b<r, JsonElement>, r, c<? super JsonElement>, Object> {
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ JsonTreeReader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(JsonTreeReader jsonTreeReader, c<? super JsonTreeReader$readDeepRecursive$1> cVar) {
        super(3, cVar);
        this.this$0 = jsonTreeReader;
    }

    @Override // sn.q
    public final Object invoke(b<r, JsonElement> bVar, r rVar, c<? super JsonElement> cVar) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, cVar);
        jsonTreeReader$readDeepRecursive$1.L$0 = bVar;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(r.f5635a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objG = a.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.c.b(obj);
            b bVar = (b) this.L$0;
            byte bG = this.this$0.f73476a.G();
            if (bG == 1) {
                return this.this$0.j(true);
            }
            if (bG == 0) {
                return this.this$0.j(false);
            }
            if (bG != 6) {
                if (bG == 8) {
                    return this.this$0.f();
                }
                yo.a.z(this.this$0.f73476a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            JsonTreeReader jsonTreeReader = this.this$0;
            this.label = 1;
            obj = jsonTreeReader.h(bVar, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        return (JsonElement) obj;
    }
}
