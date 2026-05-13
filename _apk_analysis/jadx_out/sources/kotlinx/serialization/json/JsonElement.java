package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import so.k;
import tn.i;
import xo.p;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes9.dex */
@k(with = p.class)
public abstract class JsonElement {

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
        public final KSerializer<JsonElement> serializer() {
            return p.f87062a;
        }
    }

    public JsonElement() {
    }

    public /* synthetic */ JsonElement(i iVar) {
        this();
    }
}
