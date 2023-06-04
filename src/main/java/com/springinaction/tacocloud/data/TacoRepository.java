package com.springinaction.tacocloud.data;

import com.springinaction.tacocloud.Taco;

public interface TacoRepository {
    Taco save(Taco design);
}
