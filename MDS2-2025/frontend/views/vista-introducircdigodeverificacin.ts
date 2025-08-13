import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/text-area/src/vaadin-text-area.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-introducircdigodeverificacin')
export class VistaIntroducircdigodeverificacin extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout id="vaadinVerticalLayout3" style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%;"></vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout1" style="width: 100%; height: 30%;"></vaadin-horizontal-layout>
   <vaadin-text-area placeholder="Introduce código" id="codigo" style="align-self: center; margin-top: var(--lumo-space-l);"></vaadin-text-area>
   <vaadin-button id="enviar" style="align-self: center; margin-top: var(--lumo-space-l);" tabindex="0">
     Enviar 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
