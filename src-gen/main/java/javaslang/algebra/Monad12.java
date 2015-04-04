/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.algebra;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import javaslang.Function1;
import javaslang.Function12;
import javaslang.Tuple12;

public interface Monad12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, M extends HigherKinded12<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, M>> extends Functor12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12>, HigherKinded12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, M> {

    <U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, MONAD extends HigherKinded12<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, M>> Monad12<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, M> flatMap(Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, MONAD> f);

    @Override
    <U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12> Monad12<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, M> map(Function12<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? super T10, ? super T11, ? super T12, Tuple12<? extends U1, ? extends U2, ? extends U3, ? extends U4, ? extends U5, ? extends U6, ? extends U7, ? extends U8, ? extends U9, ? extends U10, ? extends U11, ? extends U12>> f);

    @Override
    <U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12> Monad12<U1, U2, U3, U4, U5, U6, U7, U8, U9, U10, U11, U12, M> map(Function1<? super T1, ? extends U1> f1, Function1<? super T2, ? extends U2> f2, Function1<? super T3, ? extends U3> f3, Function1<? super T4, ? extends U4> f4, Function1<? super T5, ? extends U5> f5, Function1<? super T6, ? extends U6> f6, Function1<? super T7, ? extends U7> f7, Function1<? super T8, ? extends U8> f8, Function1<? super T9, ? extends U9> f9, Function1<? super T10, ? extends U10> f10, Function1<? super T11, ? extends U11> f11, Function1<? super T12, ? extends U12> f12);
}