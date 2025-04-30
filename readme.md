## Name: MAHIRWE YVETTE
## ID:26510

## OBJECT ORIENTED PROGRAMMING 

## 🧾 Project Overview
This Java project bundle contains three advanced, real-world systems that demonstrate solid Object-Oriented Programming (OOP) principles including abstraction, inheritance, encapsulation, polymorphism, and input validation using Scanner.



## 📦 Project 1: Stock Management System
Manage inventory, track stock, apply discounts, and generate detailed reports.

## 🧱 Abstract Class: StockItem
Defines base structure with methods like updateStock(), validateStock(), and generateStockReport().

## 🔧 Subclasses:

ElectronicsItem – handles warranty & discount logic

ClothingItem – supports sizes/colors & value calculation

GroceryItem – tracks expiration & flags discounts

FurnitureItem – includes weight & packing validation

PerishableItem – handles short shelf life & disposal alerts

## 🔐 Encapsulated Classes:

Product – product details with input validation

Supplier – supplier contacts with format checks

Warehouse – tracks stock location & capacity

🛒 Project 2: Online Shopping System
Simulates shopping experience: browsing, cart, payment, and invoice generation.

## 🧱 Abstract Class: ShoppingItem
Base for all store items with methods like addToCart() and generateInvoice().

## 🔧 Subclasses:

ElectronicsItem – warranty & product registration

ClothingItem – size handling & seasonal discounts

GroceriesItem – bulk discounts & expiry validation

BooksItem – ISBN & edition tracking

AccessoriesItem – variety checks & customer reviews

## 🔐 Encapsulated Classes:

Customer – personal info validation

ShoppingCart – manages items & total price

Payment – handles method validation & receipts

## 🚗 Project 3: Vehicle Insurance System
Handles insurance policies, premium calculations, claims, and compliance.

## 🧱 Abstract Class: InsurancePolicy
Core for all policies with methods like calculatePremium(), processClaim(), and validatePolicy().

## 🔧 Subclasses:

ComprehensivePolicy – theft & damage, age-based premium

ThirdPartyPolicy – engine-based premium + extras

CollisionPolicy – safe driver discounts + safety check

LiabilityPolicy – includes disability coverage

RoadsideAssistancePolicy – for emergencies (towing, etc.)

## 🔐 Encapsulated Classes:

Vehicle – vehicle details & validations

Person – policyholder info checks

Claim – processes claim amount & status