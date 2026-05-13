package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import so.k;
import tn.i;
import xo.d0;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes6.dex */
@k(with = d0.class)
public abstract class JsonPrimitive extends JsonElement {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: JsonElement.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @NotNull
        public final KSerializer<JsonPrimitive> serializer() {
            return d0.f87042a;
        }
    }

    public JsonPrimitive() {
        super(null);
    }

    public /* synthetic */ JsonPrimitive(i iVar) {
        this();
    }

    @NotNull
    public abstract String f();

    @NotNull
    public String toString() {
        return f();
    }
}
