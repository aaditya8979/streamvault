package ds;

import java.net.URI;
import java.util.logging.Logger;
import org.fourthline.cling.model.types.Datatype;

/* JADX INFO: compiled from: EventedValueURI.java */
/* JADX INFO: loaded from: classes.dex */
public class g extends b<URI> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f59984b = Logger.getLogger(g.class.getName());

    public g(URI uri) {
        super(uri);
    }

    @Override // ds.b
    public Datatype b() {
        return Datatype.Builtin.URI.getDatatype();
    }
}
