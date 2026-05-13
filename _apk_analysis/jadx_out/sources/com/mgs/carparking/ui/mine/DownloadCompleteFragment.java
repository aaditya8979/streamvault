package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.dramarush.shortin.R;
import com.mgs.carparking.databinding.FragmentDownloadCompleteBinding;
import com.mgs.carparking.model.DOWNLOADCOMPLETEVIEWMODEL;
import dm.g;
import ic.j;
import ic.x;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import tb.a;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadCompleteFragment extends BaseFragment<FragmentDownloadCompleteBinding, DOWNLOADCOMPLETEVIEWMODEL> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(j jVar) throws Exception {
        ((DOWNLOADCOMPLETEVIEWMODEL) this.viewModel).n(jVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(x xVar) throws Exception {
        if (xVar.a() == 1) {
            ((DOWNLOADCOMPLETEVIEWMODEL) this.viewModel).f43910h.set(xVar.b().get());
        }
    }

    public static DownloadCompleteFragment newInstance(int i10) {
        DownloadCompleteFragment downloadCompleteFragment = new DownloadCompleteFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        downloadCompleteFragment.setArguments(bundle);
        return downloadCompleteFragment;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_download_complete;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public DOWNLOADCOMPLETEVIEWMODEL initViewModel() {
        return new DOWNLOADCOMPLETEVIEWMODEL(BaseApplication.getInstance(), a.a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        addSubscribe(op.a.a().d(j.class).subscribe(new g() { // from class: vc.c
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85956b.lambda$initViewObservable$0((ic.j) obj);
            }
        }));
        addSubscribe(op.a.a().d(x.class).subscribe(new g() { // from class: vc.d
            @Override // dm.g
            public final void accept(Object obj) throws Exception {
                this.f85957b.lambda$initViewObservable$1((ic.x) obj);
            }
        }));
    }
}
