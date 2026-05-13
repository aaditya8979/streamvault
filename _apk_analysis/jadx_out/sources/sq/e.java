package sq;

import java.util.AbstractList;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: BlockingArrayQueue.java */
/* JADX INFO: loaded from: classes9.dex */
public class e<E> extends AbstractList<E> implements BlockingQueue<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f84473d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile int f84476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object[] f84477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ReentrantLock f84478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Condition f84479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f84480k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ReentrantLock f84481l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f84482m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f84471b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f84472c = 64;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f84474e = new AtomicInteger();

    public e(int i10, int i11) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f84478i = reentrantLock;
        this.f84479j = reentrantLock.newCondition();
        this.f84481l = new ReentrantLock();
        Object[] objArr = new Object[i10];
        this.f84477h = objArr;
        this.f84476g = objArr.length;
        this.f84475f = i11;
        this.f84473d = Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        e10.getClass();
        this.f84481l.lock();
        try {
            this.f84478i.lock();
            if (i10 >= 0) {
                try {
                    if (i10 <= this.f84474e.get()) {
                        if (i10 == this.f84474e.get()) {
                            add(e10);
                        } else {
                            if (this.f84482m == this.f84480k && !f()) {
                                throw new IllegalStateException("full");
                            }
                            int i11 = this.f84480k + i10;
                            if (i11 >= this.f84476g) {
                                i11 -= this.f84476g;
                            }
                            this.f84474e.incrementAndGet();
                            int i12 = (this.f84482m + 1) % this.f84476g;
                            this.f84482m = i12;
                            if (i11 < i12) {
                                Object[] objArr = this.f84477h;
                                System.arraycopy(objArr, i11, objArr, i11 + 1, i12 - i11);
                                this.f84477h[i11] = e10;
                            } else {
                                if (i12 > 0) {
                                    Object[] objArr2 = this.f84477h;
                                    System.arraycopy(objArr2, 0, objArr2, 1, i12);
                                    Object[] objArr3 = this.f84477h;
                                    objArr3[0] = objArr3[this.f84476g - 1];
                                }
                                Object[] objArr4 = this.f84477h;
                                System.arraycopy(objArr4, i11, objArr4, i11 + 1, (this.f84476g - i11) - 1);
                                this.f84477h[i11] = e10;
                            }
                        }
                        return;
                    }
                } finally {
                    this.f84478i.unlock();
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i10 + "<=" + this.f84474e + ")");
        } finally {
            this.f84481l.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.concurrent.BlockingQueue, java.util.Queue
    public boolean add(E e10) {
        return offer(e10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f84481l.lock();
        try {
            this.f84478i.lock();
            try {
                this.f84480k = 0;
                this.f84482m = 0;
                this.f84474e.set(0);
            } finally {
                this.f84478i.unlock();
            }
        } finally {
            this.f84481l.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        throw new UnsupportedOperationException();
    }

    public int e() {
        return this.f84476g;
    }

    @Override // java.util.Queue
    public E element() {
        E ePeek = peek();
        if (ePeek != null) {
            return ePeek;
        }
        throw new NoSuchElementException();
    }

    public final boolean f() {
        int i10;
        if (this.f84475f <= 0) {
            return false;
        }
        this.f84481l.lock();
        try {
            this.f84478i.lock();
            try {
                int i11 = this.f84480k;
                int i12 = this.f84482m;
                Object[] objArr = new Object[this.f84476g + this.f84475f];
                if (i11 < i12) {
                    i10 = i12 - i11;
                    System.arraycopy(this.f84477h, i11, objArr, 0, i10);
                } else if (i11 > i12 || this.f84474e.get() > 0) {
                    int i13 = (this.f84476g + i12) - i11;
                    int i14 = this.f84476g - i11;
                    System.arraycopy(this.f84477h, i11, objArr, 0, i14);
                    System.arraycopy(this.f84477h, 0, objArr, i14, i12);
                    i10 = i13;
                } else {
                    i10 = 0;
                }
                this.f84477h = objArr;
                this.f84476g = objArr.length;
                this.f84480k = 0;
                this.f84482m = i10;
                return true;
            } finally {
                this.f84478i.unlock();
            }
        } finally {
            this.f84481l.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        this.f84481l.lock();
        try {
            this.f84478i.lock();
            if (i10 >= 0) {
                try {
                    if (i10 < this.f84474e.get()) {
                        int i11 = this.f84480k + i10;
                        if (i11 >= this.f84476g) {
                            i11 -= this.f84476g;
                        }
                        return (E) this.f84477h[i11];
                    }
                } finally {
                    this.f84478i.unlock();
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i10 + "<=" + this.f84474e + ")");
        } finally {
            this.f84481l.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f84474e.get() == 0;
    }

    @Override // java.util.concurrent.BlockingQueue, java.util.Queue
    public boolean offer(E e10) {
        e10.getClass();
        this.f84481l.lock();
        try {
            if (this.f84474e.get() < this.f84473d) {
                if (this.f84474e.get() == this.f84476g) {
                    this.f84478i.lock();
                    try {
                        if (f()) {
                            this.f84478i.unlock();
                        } else {
                            this.f84478i.unlock();
                        }
                    } finally {
                    }
                }
                Object[] objArr = this.f84477h;
                int i10 = this.f84482m;
                objArr[i10] = e10;
                this.f84482m = (i10 + 1) % this.f84476g;
                if (this.f84474e.getAndIncrement() == 0) {
                    this.f84478i.lock();
                    try {
                        this.f84479j.signal();
                    } finally {
                    }
                }
                return true;
            }
            return false;
        } finally {
            this.f84481l.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public E peek() {
        E e10 = null;
        if (this.f84474e.get() == 0) {
            return null;
        }
        this.f84478i.lock();
        try {
            if (this.f84474e.get() > 0) {
                e10 = (E) this.f84477h[this.f84480k];
            }
            return e10;
        } finally {
            this.f84478i.unlock();
        }
    }

    @Override // java.util.Queue
    public E poll() {
        E e10 = null;
        if (this.f84474e.get() == 0) {
            return null;
        }
        this.f84478i.lock();
        try {
            if (this.f84474e.get() > 0) {
                int i10 = this.f84480k;
                Object[] objArr = this.f84477h;
                Object obj = objArr[i10];
                objArr[i10] = null;
                this.f84480k = (i10 + 1) % this.f84476g;
                if (this.f84474e.decrementAndGet() > 0) {
                    this.f84479j.signal();
                }
                e10 = (E) obj;
            }
            return e10;
        } finally {
            this.f84478i.unlock();
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        long nanos = timeUnit.toNanos(j10);
        this.f84478i.lockInterruptibly();
        while (this.f84474e.get() == 0) {
            try {
                try {
                    if (nanos <= 0) {
                        return null;
                    }
                    nanos = this.f84479j.awaitNanos(nanos);
                } catch (InterruptedException e10) {
                    this.f84479j.signal();
                    throw e10;
                }
            } finally {
                this.f84478i.unlock();
            }
        }
        Object[] objArr = this.f84477h;
        int i10 = this.f84480k;
        E e11 = (E) objArr[i10];
        objArr[i10] = null;
        this.f84480k = (i10 + 1) % this.f84476g;
        if (this.f84474e.decrementAndGet() > 0) {
            this.f84479j.signal();
        }
        return e11;
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        if (!add(e10)) {
            throw new IllegalStateException("full");
        }
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        this.f84481l.lock();
        try {
            this.f84478i.lock();
            try {
                return e() - size();
            } finally {
                this.f84478i.unlock();
            }
        } finally {
            this.f84481l.unlock();
        }
    }

    @Override // java.util.Queue
    public E remove() {
        E ePoll = poll();
        if (ePoll != null) {
            return ePoll;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        this.f84481l.lock();
        try {
            this.f84478i.lock();
            if (i10 >= 0) {
                try {
                    if (i10 < this.f84474e.get()) {
                        int i11 = this.f84480k + i10;
                        if (i11 >= this.f84476g) {
                            i11 -= this.f84476g;
                        }
                        Object[] objArr = this.f84477h;
                        E e10 = (E) objArr[i11];
                        int i12 = this.f84482m;
                        if (i11 < i12) {
                            System.arraycopy(objArr, i11 + 1, objArr, i11, i12 - i11);
                            this.f84482m--;
                            this.f84474e.decrementAndGet();
                        } else {
                            System.arraycopy(objArr, i11 + 1, objArr, i11, (this.f84476g - i11) - 1);
                            if (this.f84482m > 0) {
                                Object[] objArr2 = this.f84477h;
                                int i13 = this.f84476g;
                                Object[] objArr3 = this.f84477h;
                                objArr2[i13] = objArr3[0];
                                System.arraycopy(objArr3, 1, objArr3, 0, this.f84482m - 1);
                                this.f84482m--;
                            } else {
                                this.f84482m = this.f84476g - 1;
                            }
                            this.f84474e.decrementAndGet();
                        }
                        return e10;
                    }
                } finally {
                    this.f84478i.unlock();
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i10 + "<=" + this.f84474e + ")");
        } finally {
            this.f84481l.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        e10.getClass();
        this.f84481l.lock();
        try {
            this.f84478i.lock();
            if (i10 >= 0) {
                try {
                    if (i10 < this.f84474e.get()) {
                        int i11 = this.f84480k + i10;
                        if (i11 >= this.f84476g) {
                            i11 -= this.f84476g;
                        }
                        Object[] objArr = this.f84477h;
                        E e11 = (E) objArr[i11];
                        objArr[i11] = e10;
                        return e11;
                    }
                } finally {
                    this.f84478i.unlock();
                }
            }
            throw new IndexOutOfBoundsException("!(0<" + i10 + "<=" + this.f84474e + ")");
        } finally {
            this.f84481l.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f84474e.get();
    }

    @Override // java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        this.f84478i.lockInterruptibly();
        while (this.f84474e.get() == 0) {
            try {
                try {
                    this.f84479j.await();
                } catch (InterruptedException e10) {
                    this.f84479j.signal();
                    throw e10;
                }
            } finally {
                this.f84478i.unlock();
            }
        }
        int i10 = this.f84480k;
        Object[] objArr = this.f84477h;
        E e11 = (E) objArr[i10];
        objArr[i10] = null;
        this.f84480k = (i10 + 1) % this.f84476g;
        if (this.f84474e.decrementAndGet() > 0) {
            this.f84479j.signal();
        }
        return e11;
    }
}
