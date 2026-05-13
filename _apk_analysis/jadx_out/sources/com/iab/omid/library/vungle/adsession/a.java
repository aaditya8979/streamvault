package com.iab.omid.library.vungle.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.vungle.internal.c;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.b;
import com.iab.omid.library.vungle.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f24930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.weakreference.a f24931d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24932e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24933f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24935h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24936i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24937j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24938k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f24930c = new f();
        this.f24933f = false;
        this.f24934g = false;
        this.f24929b = adSessionConfiguration;
        this.f24928a = adSessionContext;
        this.f24935h = str;
        b(null);
        this.f24932e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.vungle.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24932e.i();
        c.c().a(this);
        this.f24932e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f24936i) {
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
                aVar.f24931d.clear();
            }
        }
    }

    private void b() {
        if (this.f24937j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f24931d = new com.iab.omid.library.vungle.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.vungle.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.vungle.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24938k.onPossibleObstructionsDetected(this.f24935h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f24937j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f24934g) {
            return;
        }
        this.f24930c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f24935h;
    }

    public AdSessionStatePublisher d() {
        return this.f24932e;
    }

    public View e() {
        return this.f24931d.get();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24934g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f24930c.a();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f24934g) {
            return;
        }
        this.f24931d.clear();
        removeAllFriendlyObstructions();
        this.f24934g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f24932e = null;
        this.f24938k = null;
    }

    public boolean g() {
        return this.f24938k != null;
    }

    public boolean h() {
        return this.f24933f && !this.f24934g;
    }

    public boolean i() {
        return this.f24934g;
    }

    public boolean j() {
        return this.f24929b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f24929b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f24933f;
    }

    public void m() {
        a();
        d().g();
        this.f24936i = true;
    }

    public void n() {
        b();
        d().h();
        this.f24937j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f24934g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24934g) {
            return;
        }
        this.f24930c.b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24934g) {
            return;
        }
        this.f24930c.c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24938k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f24933f || this.f24932e == null) {
            return;
        }
        this.f24933f = true;
        c.c().c(this);
        this.f24932e.a(i.c().b());
        this.f24932e.a(com.iab.omid.library.vungle.internal.a.a().b());
        this.f24932e.a(this, this.f24928a);
    }
}
