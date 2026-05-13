package kotlin.collections.builders;

import cn.p0;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
final class SerializedMap implements Externalizable {

    @NotNull
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 0;

    @NotNull
    private Map<?, ?> map;

    /* JADX INFO: compiled from: MapBuilder.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public SerializedMap() {
        this(kotlin.collections.a.j());
    }

    public SerializedMap(@NotNull Map<?, ?> map) {
        p.k(map, "map");
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) throws IOException {
        p.k(objectInput, "input");
        byte b10 = objectInput.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10));
        }
        int i10 = objectInput.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i10 + '.');
        }
        Map mapE = p0.e(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapE.put(objectInput.readObject(), objectInput.readObject());
        }
        this.map = p0.c(mapE);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) throws IOException {
        p.k(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
