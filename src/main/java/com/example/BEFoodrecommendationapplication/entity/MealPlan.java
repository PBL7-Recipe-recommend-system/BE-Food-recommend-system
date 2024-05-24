package com.example.BEFoodrecommendationapplication.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "meal_plans")
@Getter
@Setter
public class MealPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;

    @OneToOne
    @JoinColumn(name = "breakfast_id")
    private FoodRecipe breakfast;

    @OneToOne
    @JoinColumn(name = "lunch_id")
    private FoodRecipe lunch;

    @OneToOne
    @JoinColumn(name = "dinner_id")
    private FoodRecipe dinner;

    @OneToOne
    @JoinColumn(name = "brunch_id")
    private FoodRecipe brunch;

    @OneToOne
    @JoinColumn(name = "snack_id")
    private FoodRecipe snack;

    @Column(name = "meal_count")
    private int mealCount;

    @Column(name = "date", nullable = false)
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate date;

    @Column(name = "daily_calorie")
    private Integer dailyCalorie;

    @Column(name = "total_calorie")
    private Integer totalCalorie;

    @Column(name = "description")
    private String description;



}
