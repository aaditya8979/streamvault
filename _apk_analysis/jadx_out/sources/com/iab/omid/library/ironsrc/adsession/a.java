package com.iab.omid.library.ironsrc.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.ironsrc.internal.c;
import com.iab.omid.library.ironsrc.internal.e;
import com.iab.omid.library.ironsrc.internal.f;
import com.iab.omid.library.ironsrc.internal.i;
import com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher;
import com.iab.omid.library.ironsrc.publisher.b;
import com.iab.omid.library.ironsrc.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f24532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.weakreference.a f24533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24540k;

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    public a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f24532c = new f();
        this.f24535f = false;
        this.f24536g = false;
        this.f24531b = adSessionConfiguration;
        this.f24530a = adSessionContext;
        this.f24537h = str;
        b(null);
        this.f24534e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.ironsrc.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24534e.i();
        c.c().a(this);
        this.f24534e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f24538i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f24533d.clear();
            }
        }
    }

    private void b() {
        if (this.f24539j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void b(@Nullable View view) {
        this.f24533d = new com.iab.omid.library.ironsrc.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.ironsrc.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.ironsrc.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24540k.onPossibleObstructionsDetected(this.f24537h, arrayList);
        }
    }

    public void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24539j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f24536g) {
            return;
        }
        this.f24532c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f24533d.get();
    }

    public List<e> d() {
        return this.f24532c.a();
    }

    public boolean e() {
        return this.f24540k != null;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24536g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f24535f && !this.f24536g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void finish() {
        if (this.f24536g) {
            return;
        }
        this.f24533d.clear();
        removeAllFriendlyObstructions();
        this.f24536g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f24534e = null;
        this.f24540k = null;
    }

    public boolean g() {
        return this.f24536g;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public String getAdSessionId() {
        return this.f24537h;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24534e;
    }

    public boolean h() {
        return this.f24531b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24531b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f24535f;
    }

    public void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f24538i = true;
    }

    public void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f24539j = true;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f24536g || c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24536g) {
            return;
        }
        this.f24532c.b();
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24536g) {
            return;
        }
        this.f24532c.c(view);
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24540k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.ironsrc.adsession.AdSession
    public void start() {
        if (this.f24535f || this.f24534e == null) {
            return;
        }
        this.f24535f = true;
        c.c().c(this);
        this.f24534e.a(i.c().b());
        this.f24534e.a(com.iab.omid.library.ironsrc.internal.a.a().b());
        this.f24534e.a(this, this.f24530a);
    }
}
