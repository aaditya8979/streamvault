package io.ktor.utils.io;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tn.i;
import tn.p;

/* JADX INFO: compiled from: JvmSerializable.jvm.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class DefaultJvmSerializerReplacement<T> implements Externalizable {

    @NotNull
    public static final a Companion = new a(null);
    private static final long serialVersionUID = 0;

    @Nullable
    private JvmSerializer<T> serializer;

    @Nullable
    private T value;

    /* JADX INFO: compiled from: JvmSerializable.jvm.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public DefaultJvmSerializerReplacement() {
        this(null, null);
    }

    public DefaultJvmSerializerReplacement(@Nullable JvmSerializer<T> jvmSerializer, @Nullable T t10) {
        this.serializer = jvmSerializer;
        this.value = t10;
    }

    private final Object readResolve() {
        T t10 = this.value;
        p.h(t10);
        return t10;
    }

    @Override // java.io.Externalizable
    public void readExternal(@NotNull ObjectInput objectInput) throws ClassNotFoundException, IOException {
        p.k(objectInput, ScarConstants.IN_SIGNAL_KEY);
        Object object = objectInput.readObject();
        p.i(object, "null cannot be cast to non-null type io.ktor.utils.io.JvmSerializer<T of io.ktor.utils.io.DefaultJvmSerializerReplacement>");
        JvmSerializer<T> jvmSerializer = (JvmSerializer) object;
        this.serializer = jvmSerializer;
        p.h(jvmSerializer);
        Object object2 = objectInput.readObject();
        p.i(object2, "null cannot be cast to non-null type kotlin.ByteArray");
        this.value = jvmSerializer.jvmDeserialize((byte[]) object2);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@NotNull ObjectOutput objectOutput) throws IOException {
        p.k(objectOutput, "out");
        objectOutput.writeObject(this.serializer);
        JvmSerializer<T> jvmSerializer = this.serializer;
        p.h(jvmSerializer);
        T t10 = this.value;
        p.h(t10);
        objectOutput.writeObject(jvmSerializer.jvmSerialize(t10));
    }
}
