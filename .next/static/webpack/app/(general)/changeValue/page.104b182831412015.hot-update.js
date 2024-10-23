"use strict";
/*
 * ATTENTION: An "eval-source-map" devtool has been used.
 * This devtool is neither made for production nor for readable output files.
 * It uses "eval()" calls to create a separate source file with attached SourceMaps in the browser devtools.
 * If you are trying to read the output file, select a different devtool (https://webpack.js.org/configuration/devtool/)
 * or disable the default devtool with "devtool: false".
 * If you are looking for production-ready output files, see mode: "production" (https://webpack.js.org/configuration/mode/).
 */
self["webpackHotUpdate_N_E"]("app/(general)/changeValue/page",{

/***/ "(app-pages-browser)/./app/(general)/changeValue/page.tsx":
/*!********************************************!*\
  !*** ./app/(general)/changeValue/page.tsx ***!
  \********************************************/
/***/ (function(module, __webpack_exports__, __webpack_require__) {

eval(__webpack_require__.ts("__webpack_require__.r(__webpack_exports__);\n/* harmony export */ __webpack_require__.d(__webpack_exports__, {\n/* harmony export */   \"default\": function() { return /* binding */ ChangeValue; }\n/* harmony export */ });\n/* harmony import */ var react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! react/jsx-dev-runtime */ \"(app-pages-browser)/./node_modules/next/dist/compiled/react/jsx-dev-runtime.js\");\n/* harmony import */ var _primer_octicons_react__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @primer/octicons-react */ \"(app-pages-browser)/./node_modules/@primer/octicons-react/dist/index.esm.mjs\");\n/* harmony import */ var next_navigation__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! next/navigation */ \"(app-pages-browser)/./node_modules/next/dist/api/navigation.js\");\n/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! react */ \"(app-pages-browser)/./node_modules/next/dist/compiled/react/index.js\");\n/* harmony import */ var react__WEBPACK_IMPORTED_MODULE_2___default = /*#__PURE__*/__webpack_require__.n(react__WEBPACK_IMPORTED_MODULE_2__);\n/* __next_internal_client_entry_do_not_use__ default auto */ \nvar _s = $RefreshSig$();\n\n\n\n\nfunction ChangeValue() {\n    _s();\n    const router = (0,next_navigation__WEBPACK_IMPORTED_MODULE_1__.useRouter)();\n    const [value, setValue] = (0,react__WEBPACK_IMPORTED_MODULE_2__.useState)(\"\"); // Estado para el valor ingresado\n    const handleCancel = ()=>{\n        router.back(); // Vuelve a la página anterior\n    };\n    //const handleEdit\n    const handleCheck = async ()=>{\n        try {\n            const response = await fetch(\"/api/updateValue\", {\n                method: \"POST\",\n                headers: {\n                    \"Content-Type\": \"application/json\"\n                },\n                body: JSON.stringify({\n                    value\n                })\n            });\n            if (!response.ok) {\n                throw new Error(\"Error al actualizar el valor en la base de datos.\");\n            }\n            // Redirigir a la página anterior o donde sea necesario\n            router.back(); // Cambia la ruta según sea necesario\n        } catch (error) {\n            console.error(error); // Manejo de errores\n        }\n    };\n    return /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"div\", {\n        className: \"flex items-center justify-center pt-60 pb-60 m-auto font-[family-name:var(--font-geist-sans)]\",\n        children: /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"main\", {\n            className: \"flex flex-col gap-8 items-center\",\n            children: /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"span\", {\n                className: \"flex flex-col items-center justify-center gap-3 bg-blue-300 bg-opacity-30 p-5 m-2 rounded-3xl text-center text-2xl\",\n                children: [\n                    \"Establece un valor\",\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"br\", {}, void 0, false, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n                        lineNumber: 43,\n                        columnNumber: 13\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"input\", {\n                        className: \"text-black p-2 m-2 w-full border border-blue-400 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500\",\n                        type: \"text\",\n                        placeholder: \"Ingresa un valor\" // Placeholder opcional\n                    }, void 0, false, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n                        lineNumber: 44,\n                        columnNumber: 13\n                    }, this),\n                    /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"div\", {\n                        className: \"flex justify-center gap-4\",\n                        children: [\n                            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"button\", {\n                                type: \"button\",\n                                onClick: ()=>handleCancel(),\n                                className: \"flex bg-blue-600 bg-opacity-30 p-2 rounded-xl\",\n                                children: /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(_primer_octicons_react__WEBPACK_IMPORTED_MODULE_3__.XIcon, {\n                                    size: 24,\n                                    className: \"p-0 m-2\"\n                                }, void 0, false, {\n                                    fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n                                    lineNumber: 51,\n                                    columnNumber: 21\n                                }, this)\n                            }, void 0, false, {\n                                fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n                                lineNumber: 50,\n                                columnNumber: 17\n                            }, this),\n                            /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(\"button\", {\n                                type: \"submit\",\n                                onClick: ()=>handleCheck(),\n                                className: \"flex bg-blue-600 bg-opacity-30 p-2 rounded-xl\",\n                                children: /*#__PURE__*/ (0,react_jsx_dev_runtime__WEBPACK_IMPORTED_MODULE_0__.jsxDEV)(_primer_octicons_react__WEBPACK_IMPORTED_MODULE_3__.CheckIcon, {\n                                    size: 24,\n                                    className: \"p-0 m-2\"\n                                }, void 0, false, {\n                                    fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n                                    lineNumber: 54,\n                                    columnNumber: 21\n                                }, this)\n                            }, void 0, false, {\n                                fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n                                lineNumber: 53,\n                                columnNumber: 17\n                            }, this)\n                        ]\n                    }, void 0, true, {\n                        fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n                        lineNumber: 49,\n                        columnNumber: 13\n                    }, this)\n                ]\n            }, void 0, true, {\n                fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n                lineNumber: 41,\n                columnNumber: 9\n            }, this)\n        }, void 0, false, {\n            fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n            lineNumber: 40,\n            columnNumber: 5\n        }, this)\n    }, void 0, false, {\n        fileName: \"/home/desarrollo1/nextProjects/app/(general)/changeValue/page.tsx\",\n        lineNumber: 39,\n        columnNumber: 1\n    }, this);\n}\n_s(ChangeValue, \"XvbWjXM4JSqjidonqPwzJ+iLHb0=\", false, function() {\n    return [\n        next_navigation__WEBPACK_IMPORTED_MODULE_1__.useRouter\n    ];\n});\n_c = ChangeValue;\nvar _c;\n$RefreshReg$(_c, \"ChangeValue\");\n\n\n;\n    // Wrapped in an IIFE to avoid polluting the global scope\n    ;\n    (function () {\n        var _a, _b;\n        // Legacy CSS implementations will `eval` browser code in a Node.js context\n        // to extract CSS. For backwards compatibility, we need to check we're in a\n        // browser context before continuing.\n        if (typeof self !== 'undefined' &&\n            // AMP / No-JS mode does not inject these helpers:\n            '$RefreshHelpers$' in self) {\n            // @ts-ignore __webpack_module__ is global\n            var currentExports = module.exports;\n            // @ts-ignore __webpack_module__ is global\n            var prevSignature = (_b = (_a = module.hot.data) === null || _a === void 0 ? void 0 : _a.prevSignature) !== null && _b !== void 0 ? _b : null;\n            // This cannot happen in MainTemplate because the exports mismatch between\n            // templating and execution.\n            self.$RefreshHelpers$.registerExportsForReactRefresh(currentExports, module.id);\n            // A module can be accepted automatically based on its exports, e.g. when\n            // it is a Refresh Boundary.\n            if (self.$RefreshHelpers$.isReactRefreshBoundary(currentExports)) {\n                // Save the previous exports signature on update so we can compare the boundary\n                // signatures. We avoid saving exports themselves since it causes memory leaks (https://github.com/vercel/next.js/pull/53797)\n                module.hot.dispose(function (data) {\n                    data.prevSignature =\n                        self.$RefreshHelpers$.getRefreshBoundarySignature(currentExports);\n                });\n                // Unconditionally accept an update to this module, we'll check if it's\n                // still a Refresh Boundary later.\n                // @ts-ignore importMeta is replaced in the loader\n                module.hot.accept();\n                // This field is set when the previous version of this module was a\n                // Refresh Boundary, letting us know we need to check for invalidation or\n                // enqueue an update.\n                if (prevSignature !== null) {\n                    // A boundary can become ineligible if its exports are incompatible\n                    // with the previous exports.\n                    //\n                    // For example, if you add/remove/change exports, we'll want to\n                    // re-execute the importing modules, and force those components to\n                    // re-render. Similarly, if you convert a class component to a\n                    // function, we want to invalidate the boundary.\n                    if (self.$RefreshHelpers$.shouldInvalidateReactRefreshBoundary(prevSignature, self.$RefreshHelpers$.getRefreshBoundarySignature(currentExports))) {\n                        module.hot.invalidate();\n                    }\n                    else {\n                        self.$RefreshHelpers$.scheduleUpdate();\n                    }\n                }\n            }\n            else {\n                // Since we just executed the code for the module, it's possible that the\n                // new exports made it ineligible for being a boundary.\n                // We only care about the case when we were _previously_ a boundary,\n                // because we already accepted this update (accidental side effect).\n                var isNoLongerABoundary = prevSignature !== null;\n                if (isNoLongerABoundary) {\n                    module.hot.invalidate();\n                }\n            }\n        }\n    })();\n//# sourceURL=[module]\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,eyJ2ZXJzaW9uIjozLCJmaWxlIjoiKGFwcC1wYWdlcy1icm93c2VyKS8uL2FwcC8oZ2VuZXJhbCkvY2hhbmdlVmFsdWUvcGFnZS50c3giLCJtYXBwaW5ncyI6Ijs7Ozs7Ozs7Ozs7QUFDa0Q7QUFDSjtBQUNGO0FBQ1g7QUFHbEIsU0FBU0k7O0lBQ3BCLE1BQU1DLFNBQU9ILDBEQUFTQTtJQUN0QixNQUFNLENBQUNJLE9BQU9DLFNBQVMsR0FBR0osK0NBQVFBLENBQUMsS0FBSyxpQ0FBaUM7SUFHekUsTUFBTUssZUFBZTtRQUNqQkgsT0FBT0ksSUFBSSxJQUFJLDhCQUE4QjtJQUNqRDtJQUNBLGtCQUFrQjtJQUNsQixNQUFNQyxjQUFjO1FBQ2hCLElBQUk7WUFDQSxNQUFNQyxXQUFXLE1BQU1DLE1BQU0sb0JBQW9CO2dCQUM3Q0MsUUFBUTtnQkFDUkMsU0FBUztvQkFDTCxnQkFBZ0I7Z0JBQ3BCO2dCQUNBQyxNQUFNQyxLQUFLQyxTQUFTLENBQUM7b0JBQUVYO2dCQUFNO1lBQ2pDO1lBRUEsSUFBSSxDQUFDSyxTQUFTTyxFQUFFLEVBQUU7Z0JBQ2QsTUFBTSxJQUFJQyxNQUFNO1lBQ3BCO1lBRUEsdURBQXVEO1lBQ3ZEZCxPQUFPSSxJQUFJLElBQUkscUNBQXFDO1FBQ3hELEVBQUUsT0FBT1csT0FBTztZQUNaQyxRQUFRRCxLQUFLLENBQUNBLFFBQVEsb0JBQW9CO1FBQzlDO0lBQ0o7SUFFQSxxQkFDSiw4REFBQ0U7UUFBSUMsV0FBVTtrQkFDWCw0RUFBQ0M7WUFBS0QsV0FBVTtzQkFDWiw0RUFBQ0U7Z0JBQUtGLFdBQVU7O29CQUFxSDtrQ0FFakksOERBQUNHOzs7OztrQ0FDRCw4REFBQ0M7d0JBQ0dKLFdBQVU7d0JBQ1ZLLE1BQUs7d0JBQ0xDLGFBQVksbUJBQW1CLHVCQUF1Qjs7Ozs7O2tDQUUxRCw4REFBQ1A7d0JBQUlDLFdBQVU7OzBDQUNYLDhEQUFDTztnQ0FBT0YsTUFBSztnQ0FBU0csU0FBUyxJQUFNdkI7Z0NBQWdCZSxXQUFVOzBDQUMzRCw0RUFBQ3RCLHlEQUFLQTtvQ0FBQytCLE1BQU07b0NBQUlULFdBQVU7Ozs7Ozs7Ozs7OzBDQUUvQiw4REFBQ087Z0NBQU9GLE1BQUs7Z0NBQVNHLFNBQVMsSUFBTXJCO2dDQUFlYSxXQUFVOzBDQUMxRCw0RUFBQ3ZCLDZEQUFTQTtvQ0FBQ2dDLE1BQU07b0NBQUlULFdBQVU7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7OztBQVFuRDtHQXREd0JuQjs7UUFDUEYsc0RBQVNBOzs7S0FERkUiLCJzb3VyY2VzIjpbIndlYnBhY2s6Ly9fTl9FLy4vYXBwLyhnZW5lcmFsKS9jaGFuZ2VWYWx1ZS9wYWdlLnRzeD81YjAyIl0sInNvdXJjZXNDb250ZW50IjpbIlwidXNlIGNsaWVudFwiO1xuaW1wb3J0IHsgQ2hlY2tJY29uIH0gZnJvbSBcIkBwcmltZXIvb2N0aWNvbnMtcmVhY3RcIlxuaW1wb3J0IHsgWEljb24gfSBmcm9tIFwiQHByaW1lci9vY3RpY29ucy1yZWFjdFwiXG5pbXBvcnQgeyB1c2VSb3V0ZXIgfSBmcm9tIFwibmV4dC9uYXZpZ2F0aW9uXCI7XG5pbXBvcnQgeyB1c2VTdGF0ZSB9IGZyb20gXCJyZWFjdFwiO1xuXG5cbmV4cG9ydCBkZWZhdWx0IGZ1bmN0aW9uIENoYW5nZVZhbHVlKCl7XG4gICAgY29uc3Qgcm91dGVyPXVzZVJvdXRlcigpO1xuICAgIGNvbnN0IFt2YWx1ZSwgc2V0VmFsdWVdID0gdXNlU3RhdGUoXCJcIik7IC8vIEVzdGFkbyBwYXJhIGVsIHZhbG9yIGluZ3Jlc2Fkb1xuXG5cbiAgICBjb25zdCBoYW5kbGVDYW5jZWwgPSAoKSA9PiB7XG4gICAgICAgIHJvdXRlci5iYWNrKCk7IC8vIFZ1ZWx2ZSBhIGxhIHDDoWdpbmEgYW50ZXJpb3JcbiAgICB9O1xuICAgIC8vY29uc3QgaGFuZGxlRWRpdFxuICAgIGNvbnN0IGhhbmRsZUNoZWNrID0gYXN5bmMgKCkgPT4ge1xuICAgICAgICB0cnkge1xuICAgICAgICAgICAgY29uc3QgcmVzcG9uc2UgPSBhd2FpdCBmZXRjaCgnL2FwaS91cGRhdGVWYWx1ZScsIHtcbiAgICAgICAgICAgICAgICBtZXRob2Q6ICdQT1NUJyxcbiAgICAgICAgICAgICAgICBoZWFkZXJzOiB7XG4gICAgICAgICAgICAgICAgICAgICdDb250ZW50LVR5cGUnOiAnYXBwbGljYXRpb24vanNvbicsXG4gICAgICAgICAgICAgICAgfSxcbiAgICAgICAgICAgICAgICBib2R5OiBKU09OLnN0cmluZ2lmeSh7IHZhbHVlIH0pLCAvLyBFbnZpYXIgZWwgbnVldm8gdmFsb3JcbiAgICAgICAgICAgIH0pO1xuXG4gICAgICAgICAgICBpZiAoIXJlc3BvbnNlLm9rKSB7XG4gICAgICAgICAgICAgICAgdGhyb3cgbmV3IEVycm9yKCdFcnJvciBhbCBhY3R1YWxpemFyIGVsIHZhbG9yIGVuIGxhIGJhc2UgZGUgZGF0b3MuJyk7XG4gICAgICAgICAgICB9XG5cbiAgICAgICAgICAgIC8vIFJlZGlyaWdpciBhIGxhIHDDoWdpbmEgYW50ZXJpb3IgbyBkb25kZSBzZWEgbmVjZXNhcmlvXG4gICAgICAgICAgICByb3V0ZXIuYmFjaygpOyAvLyBDYW1iaWEgbGEgcnV0YSBzZWfDum4gc2VhIG5lY2VzYXJpb1xuICAgICAgICB9IGNhdGNoIChlcnJvcikge1xuICAgICAgICAgICAgY29uc29sZS5lcnJvcihlcnJvcik7IC8vIE1hbmVqbyBkZSBlcnJvcmVzXG4gICAgICAgIH1cbiAgICB9O1xuXG4gICAgcmV0dXJuIChcbjxkaXYgY2xhc3NOYW1lPVwiZmxleCBpdGVtcy1jZW50ZXIganVzdGlmeS1jZW50ZXIgcHQtNjAgcGItNjAgbS1hdXRvIGZvbnQtW2ZhbWlseS1uYW1lOnZhcigtLWZvbnQtZ2Vpc3Qtc2FucyldXCI+XG4gICAgPG1haW4gY2xhc3NOYW1lPVwiZmxleCBmbGV4LWNvbCBnYXAtOCBpdGVtcy1jZW50ZXJcIj5cbiAgICAgICAgPHNwYW4gY2xhc3NOYW1lPVwiZmxleCBmbGV4LWNvbCBpdGVtcy1jZW50ZXIganVzdGlmeS1jZW50ZXIgZ2FwLTMgYmctYmx1ZS0zMDAgYmctb3BhY2l0eS0zMCBwLTUgbS0yIHJvdW5kZWQtM3hsIHRleHQtY2VudGVyIHRleHQtMnhsXCI+XG4gICAgICAgICAgICBFc3RhYmxlY2UgdW4gdmFsb3IgXG4gICAgICAgICAgICA8YnIgLz5cbiAgICAgICAgICAgIDxpbnB1dFxuICAgICAgICAgICAgICAgIGNsYXNzTmFtZT1cInRleHQtYmxhY2sgcC0yIG0tMiB3LWZ1bGwgYm9yZGVyIGJvcmRlci1ibHVlLTQwMCByb3VuZGVkLWxnIGZvY3VzOm91dGxpbmUtbm9uZSBmb2N1czpyaW5nLTIgZm9jdXM6cmluZy1ibHVlLTUwMFwiXG4gICAgICAgICAgICAgICAgdHlwZT1cInRleHRcIlxuICAgICAgICAgICAgICAgIHBsYWNlaG9sZGVyPVwiSW5ncmVzYSB1biB2YWxvclwiIC8vIFBsYWNlaG9sZGVyIG9wY2lvbmFsXG4gICAgICAgICAgICAvPlxuICAgICAgICAgICAgPGRpdiBjbGFzc05hbWU9XCJmbGV4IGp1c3RpZnktY2VudGVyIGdhcC00XCI+XG4gICAgICAgICAgICAgICAgPGJ1dHRvbiB0eXBlPVwiYnV0dG9uXCIgb25DbGljaz17KCkgPT4gaGFuZGxlQ2FuY2VsKCl9IGNsYXNzTmFtZT1cImZsZXggYmctYmx1ZS02MDAgYmctb3BhY2l0eS0zMCBwLTIgcm91bmRlZC14bFwiPlxuICAgICAgICAgICAgICAgICAgICA8WEljb24gc2l6ZT17MjR9IGNsYXNzTmFtZT1cInAtMCBtLTJcIiAvPlxuICAgICAgICAgICAgICAgIDwvYnV0dG9uPlxuICAgICAgICAgICAgICAgIDxidXR0b24gdHlwZT1cInN1Ym1pdFwiIG9uQ2xpY2s9eygpID0+IGhhbmRsZUNoZWNrKCl9IGNsYXNzTmFtZT1cImZsZXggYmctYmx1ZS02MDAgYmctb3BhY2l0eS0zMCBwLTIgcm91bmRlZC14bFwiPlxuICAgICAgICAgICAgICAgICAgICA8Q2hlY2tJY29uIHNpemU9ezI0fSBjbGFzc05hbWU9XCJwLTAgbS0yXCIgLz5cbiAgICAgICAgICAgICAgICA8L2J1dHRvbj5cbiAgICAgICAgICAgIDwvZGl2PlxuICAgICAgICA8L3NwYW4+XG4gICAgPC9tYWluPlxuPC9kaXY+XG5cbiAgICApO1xufSJdLCJuYW1lcyI6WyJDaGVja0ljb24iLCJYSWNvbiIsInVzZVJvdXRlciIsInVzZVN0YXRlIiwiQ2hhbmdlVmFsdWUiLCJyb3V0ZXIiLCJ2YWx1ZSIsInNldFZhbHVlIiwiaGFuZGxlQ2FuY2VsIiwiYmFjayIsImhhbmRsZUNoZWNrIiwicmVzcG9uc2UiLCJmZXRjaCIsIm1ldGhvZCIsImhlYWRlcnMiLCJib2R5IiwiSlNPTiIsInN0cmluZ2lmeSIsIm9rIiwiRXJyb3IiLCJlcnJvciIsImNvbnNvbGUiLCJkaXYiLCJjbGFzc05hbWUiLCJtYWluIiwic3BhbiIsImJyIiwiaW5wdXQiLCJ0eXBlIiwicGxhY2Vob2xkZXIiLCJidXR0b24iLCJvbkNsaWNrIiwic2l6ZSJdLCJzb3VyY2VSb290IjoiIn0=\n//# sourceURL=webpack-internal:///(app-pages-browser)/./app/(general)/changeValue/page.tsx\n"));

/***/ })

});