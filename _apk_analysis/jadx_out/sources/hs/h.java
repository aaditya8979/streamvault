package hs;

import java.util.Map;
import org.fourthline.cling.model.types.Datatype;
import org.fourthline.cling.support.shared.AbstractMap$SimpleEntry;
import ur.d0;

/* JADX INFO: compiled from: EventedValueChannelVolumeDB.java */
/* JADX INFO: loaded from: classes8.dex */
public class h extends ds.b<d> {
    public h(d dVar) {
        super(dVar);
    }

    @Override // ds.b
    public Map.Entry<String, String>[] a() {
        return new Map.Entry[]{new AbstractMap$SimpleEntry("val", new d0().e(new org.fourthline.cling.model.types.d(d().b().intValue()))), new AbstractMap$SimpleEntry("channel", d().a().name())};
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
