package mr;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.message.header.UpnpHeader;
import org.fourthline.cling.model.types.ErrorCode;
import pr.x;
import ur.u;

/* JADX INFO: compiled from: IncomingActionRequestMessage.java */
/* JADX INFO: loaded from: classes9.dex */
public class d extends org.fourthline.cling.model.message.b implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final org.fourthline.cling.model.meta.a f74996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f74997i;

    public d(org.fourthline.cling.model.message.b bVar, qr.f fVar) throws ActionException {
        super(bVar);
        x xVar = (x) j().s(UpnpHeader.Type.SOAPACTION, x.class);
        if (xVar == null) {
            throw new ActionException(ErrorCode.INVALID_ACTION, "Missing SOAP action header");
        }
        u uVarB = xVar.b();
        org.fourthline.cling.model.meta.a<qr.f> aVarA = fVar.a(uVarB.a());
        this.f74996h = aVarA;
        if (aVarA != null) {
            if (!"QueryStateVariable".equals(uVarB.a()) && !fVar.g().c(uVarB.c())) {
                throw new ActionException(ErrorCode.INVALID_ACTION, "Service doesn't support the requested service version");
            }
            this.f74997i = uVarB.d();
            return;
        }
        throw new ActionException(ErrorCode.INVALID_ACTION, "Service doesn't implement action: " + uVarB.a());
    }

    @Override // mr.a
    public String a() {
        return this.f74997i;
    }

    public org.fourthline.cling.model.meta.a y() {
        return this.f74996h;
    }
}
