package hs;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.support.shared.AbstractMap$SimpleEntry;

/* JADX INFO: compiled from: EventedValueChannelLoudness.java */
/* JADX INFO: loaded from: classes8.dex */
public class e extends ds.b<a> {
    public e(a aVar) {
        super(aVar);
    }

    @Override // ds.b
    public Map.Entry<String, String>[] a() {
        return new Map.Entry[]{new AbstractMap$SimpleEntry("val", new ur.c().e(d().b())), new AbstractMap$SimpleEntry("channel", d().a().name())};
    }

    @Override // ds.b
    public Datatype b() {
        return null;
    }

    @Override // ds.b
    public String toString() {
        return d().toString();
    }
}
