package com.waytojava.dagger2;

import dagger.Component;


/*
 * Important Points - Field Injection.
 * Name of method may be different or any name you want.
 * You can't pass super type like Activity or AppCompatActivity.
 * You must pass specified Activity name.
 * If you want to inject to another activity then create another with inject(<ActivityName>)
 *
 * */

@Component
public interface CarComponent {
    void inject(MainActivity mainActivity);
}
