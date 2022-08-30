package com.hacker.rank.practice;

import java.util.ArrayList;
import java.util.List;

public class EfficientJanitor {
	
	private static Integer tripMeter = Integer.valueOf(0);
	public static void main(String[] args) {
		List<Float> weight = new ArrayList<>();
		weight.add(1.01F);
		weight.add(1.5F);
		weight.add(1.5F);
		weight.add(1.4F);
		weight.add(2.0F);
		for (int i = 0; i < weight.size(); i++) {
			Float w = weight.get(i);
			if (w > 0.0F) {
				tripMeter = selectRightWeightToAdd(i, tripMeter, w, weight);
				weight.set(i, -1.0F);
			}
		}

		System.out.print(tripMeter);

	}

	private static Integer selectRightWeightToAdd(int index, Integer tripMeter, Float w, List<Float> weightList) {

		Float addableWeight = 0F;
		Float requiredWeight = 3.00F - w;
		int addableWeightIndex = -1;
		for (int j = 0; j < weightList.size(); j++) {
			Float currentWeight = weightList.get(j);
			if (j != index && requiredWeight >= currentWeight && currentWeight >= addableWeight) {
				addableWeight = currentWeight;
				addableWeightIndex = j;

			}
		}
		if (w + addableWeight < 3.0F && addableWeightIndex > 0) {
			weightList.set(addableWeightIndex, -1.0F);
			tripMeter = selectRightWeightToAdd(index, tripMeter, w + addableWeight, weightList);
		} else {
			tripMeter++;
		}
		return tripMeter;
	}
}
