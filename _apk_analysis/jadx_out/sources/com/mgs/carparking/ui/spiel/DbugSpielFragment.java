package com.mgs.carparking.ui.spiel;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import com.dramarush.shortin.R;
import com.mgs.carparking.databinding.FragmentSpielBinding;
import com.mgs.carparking.model.SPIELVIEWMODEL;
import dm.g;
import ed.l0;
import ic.i0;
import ic.j0;
import ic.k0;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import org.json.JSONObject;
import zp.n;

/* JADX INFO: loaded from: classes11.dex */
public class DbugSpielFragment extends BaseFragment<FragmentSpielBinding, SPIELVIEWMODEL> implements vd.a {

    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            if (i10 == 100) {
                ((FragmentSpielBinding) DbugSpielFragment.this.binding).f43098d.setVisibility(8);
            } else {
                ((FragmentSpielBinding) DbugSpielFragment.this.binding).f43098d.setProgress(i10);
            }
            super.onProgressChanged(webView, i10);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (((FragmentSpielBinding) DbugSpielFragment.this.binding).f43099e.canGoBack()) {
                ((FragmentSpielBinding) DbugSpielFragment.this.binding).f43099e.goBack();
            }
        }
    }

    public class c {
        public c() {
        }

        @JavascriptInterface
        public void addAdsFreeDays(String str) {
            op.a.a().b(new j0(str));
        }

        @JavascriptInterface
        public void getAdsIsReady() {
            op.a.a().b(new i0("2"));
        }

        @JavascriptInterface
        public void gotoBrowser(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                ed.a.a(DbugSpielFragment.this.getContext(), str);
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void showRewardVideo() {
            op.a.a().b(new i0("1"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(String str) {
        ((FragmentSpielBinding) this.binding).f43099e.evaluateJavascript("dispatch('JS_CALL_CODE', " + str + ")", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(k0 k0Var) throws Exception {
        Log.e("WEB_AD", "---------------code:" + k0Var.getType() + "----------------------");
        final String strQuote = JSONObject.quote(k0Var.getType());
        ((FragmentSpielBinding) this.binding).f43099e.post(new Runnable() { // from class: bd.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f5560b.lambda$initViewObservable$0(strQuote);
            }
        });
    }

    @Override // vd.a
    public BaseFragment getFragment() {
        return this;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_spiel;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        initWebView();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public SPIELVIEWMODEL initViewModel() {
        return new SPIELVIEWMODEL(BaseApplication.getInstance(), tb.a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        addSubscribe(op.a.a().d(k0.class).subscribe(new g() { // from class: bd.b
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f5562b.lambda$initViewObservable$1((k0) obj);
            }
        }));
    }

    public void initWebView() {
        WebSettings settings = ((FragmentSpielBinding) this.binding).f43099e.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("GBK");
        ((FragmentSpielBinding) this.binding).f43099e.setVerticalScrollbarOverlay(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setCacheMode(-1);
        settings.setDisplayZoomControls(false);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setDomStorageEnabled(true);
        ((FragmentSpielBinding) this.binding).f43099e.addJavascriptInterface(new c(), "AndroidNative");
        ((FragmentSpielBinding) this.binding).f43099e.setWebViewClient(new WebViewClient());
        settings.setMixedContentMode(0);
        ec.b.f("链接为：");
        ((FragmentSpielBinding) this.binding).f43099e.loadUrl(l0.F());
        ((FragmentSpielBinding) this.binding).f43099e.setWebChromeClient(new a());
        ((FragmentSpielBinding) this.binding).f43097c.setOnClickListener(new b());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(getActivity());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        V v10 = this.binding;
        if (((FragmentSpielBinding) v10).f43099e != null) {
            ((FragmentSpielBinding) v10).f43099e.setWebChromeClient(null);
            ((FragmentSpielBinding) this.binding).f43099e.setWebViewClient(null);
            ((FragmentSpielBinding) this.binding).f43099e.getSettings().setJavaScriptEnabled(false);
            ((FragmentSpielBinding) this.binding).f43099e.clearCache(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        V v10 = this.binding;
        if (((FragmentSpielBinding) v10).f43099e != null) {
            if (z10) {
                ((FragmentSpielBinding) v10).f43099e.onPause();
            } else {
                ((FragmentSpielBinding) v10).f43099e.onResume();
            }
        }
    }

    public void onMenuItemClick() {
    }
}
