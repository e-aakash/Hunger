/*
 * Copyright 2012 Esa-Petri Tirkkonen <esereja@yahoo.co.uk>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.hunger.events;

import org.terasology.entitySystem.AbstractEvent;
import org.terasology.entitySystem.EntityRef;

/**
 * 
 * @author Esa-Petri Tirkkonen <esereja@yahoo.co.uk>
 * 
 */
public class EatEvent extends AbstractEvent {
	private EntityRef instigator;
	private int amount;

	public EatEvent(EntityRef instigator,int amount) {
		this.instigator = instigator;
		this.amount = amount;
	}
	
    public EntityRef getInstigator() {
        return instigator;
    }
	
	public int getAmount() {
		return amount;
	}

}
