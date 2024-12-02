package com.example.diary.entity;
import com.example.diary.constant.OrderStatus;
import com.example.diary.entity.base.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString //(exclude = "itemImgList")  //toString 변수 제외할 변수명
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "orders")
public class Order extends BaseEntity {


    @Id
    @Column(name = "order_id")       //테이블에서 매핑될 컬럼
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne //회원 엔티티와 일대일로 매핑
    @JoinColumn(name = "member_id") //매핑할 외래키지정
    private Member member;


    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.LAZY)
    private List<OrderItem> orderItemList = new ArrayList<>();

    public void setOrderItemList(OrderItem item ) {
        this.orderItemList.add(item);
    }

    private LocalDateTime orderDate;  //주문일


    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;


}
