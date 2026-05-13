package com.iab.omid.library.fyber.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.fyber.internal.c;
import com.iab.omid.library.fyber.internal.e;
import com.iab.omid.library.fyber.internal.f;
import com.iab.omid.library.fyber.internal.i;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import com.iab.omid.library.fyber.publisher.b;
import com.iab.omid.library.fyber.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f24256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.weakreference.a f24257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24264k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f24256c = new f();
        this.f24259f = false;
        this.f24260g = false;
        this.f24255b = adSessionConfiguration;
        this.f24254a = adSessionContext;
        this.f24261h = str;
        b(null);
        this.f24258e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.fyber.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24258e.i();
        c.c().a(this);
        this.f24258e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f24262i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f24257d.clear();
            }
        }
    }

    private void b() {
        if (this.f24263j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f24257d = new com.iab.omid.library.fyber.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.fyber.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.fyber.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24264k.onPossibleObstructionsDetected(this.f24261h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f24263j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f24260g) {
            return;
        }
        this.f24256c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f24261h;
    }

    public AdSessionStatePublisher d() {
        return this.f24258e;
    }

    public View e() {
        return this.f24257d.get();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24260g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f24256c.a();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void finish() {
        if (this.f24260g) {
            return;
        }
        this.f24257d.clear();
        removeAllFriendlyObstructions();
        this.f24260g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f24258e = null;
        this.f24264k = null;
    }

    public boolean g() {
        return this.f24264k != null;
    }

    public boolean h() {
        return this.f24259f && !this.f24260g;
    }

    public boolean i() {
        return this.f24260g;
    }

    public boolean j() {
        return this.f24255b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f24255b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f24259f;
    }

    public void m() {
        a();
        d().g();
        this.f24262i = true;
    }

    public void n() {
        b();
        d().h();
        this.f24263j = true;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f24260g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24260g) {
            return;
        }
        this.f24256c.b();
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24260g) {
            return;
        }
        this.f24256c.c(view);
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24264k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.fyber.adsession.AdSession
    public void start() {
        if (this.f24259f || this.f24258e == null) {
            return;
        }
        this.f24259f = true;
        c.c().c(this);
        this.f24258e.a(i.c().b());
        this.f24258e.a(com.iab.omid.library.fyber.internal.a.a().b());
        this.f24258e.a(this, this.f24254a);
    }
}
