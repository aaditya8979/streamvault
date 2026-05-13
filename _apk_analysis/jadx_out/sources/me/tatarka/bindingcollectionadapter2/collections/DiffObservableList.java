package me.tatarka.bindingcollectionadapter2.collections;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.ListChangeRegistry;
import androidx.databinding.ObservableList;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class DiffObservableList<T> extends AbstractList<T> implements ObservableList<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f74225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<T> f74226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DiffUtil.ItemCallback<T> f74227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f74228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ListChangeRegistry f74229f;

    public class a extends DiffUtil.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f74230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f74231b;

        public a(List list, List list2) {
            this.f74230a = list;
            this.f74231b = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int i10, int i11) {
            Object obj = this.f74230a.get(i10);
            Object obj2 = this.f74231b.get(i11);
            if (obj == null || obj2 == null) {
                return true;
            }
            return DiffObservableList.this.f74227d.areContentsTheSame(obj, obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int i10, int i11) {
            Object obj = this.f74230a.get(i10);
            Object obj2 = this.f74231b.get(i11);
            return (obj == null || obj2 == null) ? obj == null && obj2 == null : DiffObservableList.this.f74227d.areItemsTheSame(obj, obj2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        @Nullable
        public Object getChangePayload(int i10, int i11) {
            return DiffObservableList.this.f74227d.getChangePayload(this.f74230a.get(i10), this.f74231b.get(i11));
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            List list = this.f74231b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.f74230a.size();
        }
    }

    @Override // androidx.databinding.ObservableList
    public void addOnListChangedCallback(@NonNull ObservableList.OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback) {
        this.f74229f.add(onListChangedCallback);
    }

    public final DiffUtil.DiffResult e(List<T> list, List<T> list2) {
        return DiffUtil.calculateDiff(new a(list, list2), this.f74228e);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.f74226c.get(i10);
    }

    @Override // androidx.databinding.ObservableList
    public void removeOnListChangedCallback(@NonNull ObservableList.OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback) {
        this.f74229f.remove(onListChangedCallback);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f74226c.size();
    }

    @MainThread
    public void update(@NonNull List<T> list) {
        DiffUtil.DiffResult diffResultE = e(this.f74226c, list);
        this.f74226c = list;
        diffResultE.dispatchUpdatesTo((ListUpdateCallback) null);
    }

    @MainThread
    public void update(@NonNull List<T> list, @NonNull DiffUtil.DiffResult diffResult) {
        synchronized (this.f74225b) {
            this.f74226c = list;
        }
        diffResult.dispatchUpdatesTo((ListUpdateCallback) null);
    }
}
