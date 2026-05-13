package yads;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class sx1 extends i {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient y43 f95006h;

    public sx1(Map map, ox1 ox1Var) {
        super(map);
        this.f95006h = (y43) ng2.a(ox1Var);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f95006h = (y43) objectInputStream.readObject();
        Map map = (Map) objectInputStream.readObject();
        this.f87525f = map;
        this.f87526g = 0;
        for (Collection collection : map.values()) {
            if (!(!collection.isEmpty())) {
                throw new IllegalArgumentException();
            }
            this.f87526g = collection.size() + this.f87526g;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f95006h);
        objectOutputStream.writeObject(this.f87525f);
    }
}
