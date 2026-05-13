package chuangyuan.ycj.videolibrary.offline;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$string;
import chuangyuan.ycj.videolibrary.R$style;
import com.google.android.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer.trackselection.b;
import com.google.android.exoplayer.ui.TrackSelectionView;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class TrackSelectionDialog extends DialogFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray<TrackSelectionViewFragment> f6572b = new SparseArray<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Integer> f6573c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public DialogInterface.OnClickListener f6575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public DialogInterface.OnDismissListener f6576f;

    public static final class TrackSelectionViewFragment extends Fragment implements TrackSelectionView.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b.a f6577b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f6578c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f6579d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f6580e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f6581f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public List<DefaultTrackSelector.SelectionOverride> f6582g;

        public TrackSelectionViewFragment() {
            setRetainInstance(true);
        }

        @Override // com.google.android.exoplayer.ui.TrackSelectionView.c
        public void b(boolean z10, List<DefaultTrackSelector.SelectionOverride> list) {
            this.f6581f = z10;
            this.f6582g = list;
        }

        @Override // androidx.fragment.app.Fragment
        @Nullable
        public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
            View viewInflate = layoutInflater.inflate(R$layout.exo_track_selection_dialog, viewGroup, false);
            TrackSelectionView trackSelectionView = (TrackSelectionView) viewInflate.findViewById(R$id.exo_track_selection_view);
            trackSelectionView.setShowDisableOption(true);
            trackSelectionView.setAllowMultipleOverrides(this.f6580e);
            trackSelectionView.setAllowAdaptiveSelections(this.f6579d);
            trackSelectionView.d(this.f6577b, this.f6578c, this.f6581f, this.f6582g, this);
            return viewInflate;
        }
    }

    public final class a extends FragmentPagerAdapter {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return TrackSelectionDialog.this.f6572b.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i10) {
            return (Fragment) TrackSelectionDialog.this.f6572b.valueAt(i10);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @Nullable
        public CharSequence getPageTitle(int i10) {
            return TrackSelectionDialog.h(TrackSelectionDialog.this.getResources(), ((Integer) TrackSelectionDialog.this.f6573c.get(i10)).intValue());
        }
    }

    public TrackSelectionDialog() {
        setRetainInstance(true);
    }

    public static String h(Resources resources, int i10) {
        if (i10 == 1) {
            return resources.getString(R$string.exo_track_selection_title_audio);
        }
        if (i10 == 2) {
            return resources.getString(R$string.exo_track_selection_title_video);
        }
        if (i10 == 3) {
            return resources.getString(R$string.exo_track_selection_title_text);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(View view) {
        this.f6575e.onClick(getDialog(), -1);
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AppCompatDialog appCompatDialog = new AppCompatDialog(getActivity(), R$style.TrackSelectionDialogThemeOverlay);
        appCompatDialog.setTitle(this.f6574d);
        return appCompatDialog;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R$layout.track_selection_dialog, viewGroup, false);
        TabLayout tabLayout = (TabLayout) viewInflate.findViewById(R$id.track_selection_dialog_tab_layout);
        ViewPager viewPager = (ViewPager) viewInflate.findViewById(R$id.track_selection_dialog_view_pager);
        Button button = (Button) viewInflate.findViewById(R$id.track_selection_dialog_cancel_button);
        Button button2 = (Button) viewInflate.findViewById(R$id.track_selection_dialog_ok_button);
        viewPager.setAdapter(new a(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setVisibility(this.f6572b.size() <= 1 ? 8 : 0);
        button.setOnClickListener(new View.OnClickListener() { // from class: u.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85425b.i(view);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { // from class: u.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85426b.j(view);
            }
        });
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.f6576f.onDismiss(dialogInterface);
    }
}
