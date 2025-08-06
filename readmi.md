**Lab 04 - Tu Thi Hong Diep - 2131200119**



**Question**: Is the layered design reasonable?



Yes, the 3-layer architecture is reasonable because it follows clean software design principles:



\- Presentation Layer (Main.java): Handles UI/entry-point logic.

\- Service Layer (PaymentService): Focuses solely on processing logic.

\- Data Layer (PaymentMethod \& its implementations): Encapsulates payment methods.

\- Dependency Injection: Makes testing and substitution of payment types easy.

\- Open-Closed Principle: New payment types can be added without modifying existing logic.

\- Single Responsibility Principle: Each class has a clear, focused responsibility.



**My Suggestion:** 

To improve flexibility, consider using a factory or configuration file to dynamically load payment types at runtime.



