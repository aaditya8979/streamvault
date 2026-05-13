package org.fourthline.cling.support.avtransport.lastchange;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.fourthline.cling.model.types.InvalidValueException;
import org.fourthline.cling.support.model.PlayMode;
import org.fourthline.cling.support.model.RecordMediumWriteStatus;
import org.fourthline.cling.support.model.RecordQualityMode;
import org.fourthline.cling.support.model.StorageMedium;
import org.fourthline.cling.support.model.TransportAction;
import org.fourthline.cling.support.model.TransportState;
import org.fourthline.cling.support.model.TransportStatus;

/* JADX INFO: loaded from: classes7.dex */
public class AVTransportVariable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Set<Class<? extends ds.b>> f76877a = new HashSet<Class<? extends ds.b>>() { // from class: org.fourthline.cling.support.avtransport.lastchange.AVTransportVariable.1
        {
            add(x.class);
            add(y.class);
            add(t.class);
            add(r.class);
            add(p.class);
            add(f.class);
            add(w.class);
            add(s.class);
            add(g.class);
            add(q.class);
            add(o.class);
            add(h.class);
            add(i.class);
            add(e.class);
            add(j.class);
            add(k.class);
            add(a.class);
            add(m.class);
            add(b.class);
            add(n.class);
            add(l.class);
            add(v.class);
            add(d.class);
            add(u.class);
            add(c.class);
        }
    };

    public static class a extends ds.g {
        public a(URI uri) {
            super(uri);
        }
    }

    public static class b extends ds.f {
        public b(String str) {
            super(str);
        }
    }

    public static class c extends ds.f {
    }

    public static class d extends ds.f {
    }

    public static class e extends ds.f {
        public e(String str) {
            super(str);
        }
    }

    public static class f extends ds.c<PlayMode> {
        public f(PlayMode playMode) {
            super(playMode);
        }
    }

    public static class g extends ds.c<RecordQualityMode> {
        public g(RecordQualityMode recordQualityMode) {
            super(recordQualityMode);
        }
    }

    public static class h extends ds.h {
        public h(org.fourthline.cling.model.types.b bVar) {
            super(bVar);
        }
    }

    public static class i extends ds.f {
        public i(String str) {
            super(str);
        }
    }

    public static class j extends ds.f {
        public j(String str) {
            super(str);
        }
    }

    public static class k extends ds.g {
        public k(URI uri) {
            super(uri);
        }
    }

    public static class l extends ds.d<TransportAction> {
        public l(TransportAction[] transportActionArr) {
            super(transportActionArr);
        }
    }

    public static class m extends ds.g {
        public m(URI uri) {
            super(uri);
        }
    }

    public static class n extends ds.f {
        public n(String str) {
            super(str);
        }
    }

    public static class o extends ds.h {
        public o(org.fourthline.cling.model.types.b bVar) {
            super(bVar);
        }
    }

    public static class p extends r {
        public p(StorageMedium[] storageMediumArr) {
            super(storageMediumArr);
        }
    }

    public static class q extends ds.d<RecordQualityMode> {
        public q(RecordQualityMode[] recordQualityModeArr) {
            super(recordQualityModeArr);
        }
    }

    public static class r extends ds.d<StorageMedium> {
        public r(StorageMedium[] storageMediumArr) {
            super(storageMediumArr);
        }
    }

    public static class s extends ds.c<RecordMediumWriteStatus> {
        public s(RecordMediumWriteStatus recordMediumWriteStatus) {
            super(recordMediumWriteStatus);
        }
    }

    public static class t extends ds.c<StorageMedium> {
        public t(StorageMedium storageMedium) {
            super(storageMedium);
        }
    }

    public static class u extends ds.f {
    }

    public static class v extends ds.f {
    }

    public static class w extends ds.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Pattern f76878b = Pattern.compile("^-?\\d+(/\\d+)?$", 2);

        public w(String str) {
            super(str);
            if (!f76878b.matcher(str).matches()) {
                throw new InvalidValueException("Can't parse TransportPlaySpeed speeds.");
            }
        }
    }

    public static class x extends ds.c<TransportState> {
        public x(TransportState transportState) {
            super(transportState);
        }
    }

    public static class y extends ds.c<TransportStatus> {
        public y(TransportStatus transportStatus) {
            super(transportStatus);
        }
    }
}
