package com.iab.omid.library.applovin.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.internal.i;
import com.iab.omid.library.applovin.publisher.AdSessionStatePublisher;
import com.iab.omid.library.applovin.publisher.b;
import com.iab.omid.library.applovin.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f23733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f23734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f23735c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.weakreference.a f23736d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f23737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f23740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23741i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23742j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f23743k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23735c = new f();
        this.f23738f = false;
        this.f23739g = false;
        this.f23734b = adSessionConfiguration;
        this.f23733a = adSessionContext;
        this.f23740h = str;
        b(null);
        this.f23737e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.applovin.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23737e.i();
        c.c().a(this);
        this.f23737e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f23741i) {
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
                aVar.f23736d.clear();
            }
        }
    }

    private void b() {
        if (this.f23742j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f23736d = new com.iab.omid.library.applovin.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.applovin.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.applovin.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23743k.onPossibleObstructionsDetected(this.f23740h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f23742j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f23739g) {
            return;
        }
        this.f23735c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f23740h;
    }

    public AdSessionStatePublisher d() {
        return this.f23737e;
    }

    public View e() {
        return this.f23736d.get();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23739g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f23735c.a();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void finish() {
        if (this.f23739g) {
            return;
        }
        this.f23736d.clear();
        removeAllFriendlyObstructions();
        this.f23739g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f23737e = null;
        this.f23743k = null;
    }

    public boolean g() {
        return this.f23743k != null;
    }

    public boolean h() {
        return this.f23738f && !this.f23739g;
    }

    public boolean i() {
        return this.f23739g;
    }

    public boolean j() {
        return this.f23734b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f23734b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f23738f;
    }

    public void m() {
        a();
        d().g();
        this.f23741i = true;
    }

    public void n() {
        b();
        d().h();
        this.f23742j = true;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f23739g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23739g) {
            return;
        }
        this.f23735c.b();
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23739g) {
            return;
        }
        this.f23735c.c(view);
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23743k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.applovin.adsession.AdSession
    public void start() {
        if (this.f23738f || this.f23737e == null) {
            return;
        }
        this.f23738f = true;
        c.c().c(this);
        this.f23737e.a(i.c().b());
        this.f23737e.a(com.iab.omid.library.applovin.internal.a.a().b());
        this.f23737e.a(this, this.f23733a);
    }
}
